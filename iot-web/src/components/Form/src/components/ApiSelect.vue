<script lang="ts" setup>
import type { PropType } from 'vue'
import { computed, ref, unref, watch } from 'vue'
import { Select } from 'ant-design-vue'
import type { SelectValue } from 'ant-design-vue/es/select'
import { get, omit } from 'lodash-es'
import { LoadingOutlined } from '@ant-design/icons-vue'
import { isFunction } from '@/utils/is'
import { useRuleFormItem } from '@/hooks/component/useFormItem'
import { useI18n } from '@/hooks/web/useI18n'
import { propTypes } from '@/utils/propTypes'

interface OptionsItem { label: string; value: string; disabled?: boolean }

defineOptions({ name: 'ApiSelect', inheritAttrs: false })

const props = defineProps({
  value: { type: [Array, Object, String, Number] as PropType<SelectValue> },
  numberToString: propTypes.bool,
  api: {
    type: Function as PropType<(arg?: any) => Promise<OptionsItem[]>>,
    default: null,
  },
  // api params
  params: propTypes.any.def({}),
  // support device.device.xx
  resultField: propTypes.string.def(''),
  labelField: propTypes.string.def('label'),
  valueField: propTypes.string.def('value'),
  immediate: propTypes.bool.def(true),
  alwaysLoad: propTypes.bool.def(false),
  options: {
    type: Array<OptionsItem>,
    default: [],
  },
})
const emit = defineEmits(['options-change', 'change', 'update:value'])
const options = ref<OptionsItem[]>([])
const loading = ref(false)
// 首次是否加载过了
const isFirstLoaded = ref(false)
const emitData = ref<OptionsItem[]>([])

const { t } = useI18n()

// Embedded in the form, just use the hook binding to perform form verification
const [state] = useRuleFormItem(props, 'value', 'change', emitData)

const getOptions = computed(() => {
  const { labelField, valueField, numberToString } = props

  const data = unref(options).reduce((prev, next: any) => {
    if (next) {
      const value = get(next, valueField)
      prev.push({
        ...omit(next, [labelField, valueField]),
        label: get(next, labelField),
        value: numberToString ? `${value}` : value,
      })
    }
    return prev
  }, [] as OptionsItem[])
  return data.length > 0 ? data : props.options
})

watch(
  () => state.value,
  (v) => {
    emit('update:value', v)
  },
)

watch(
  () => props.params,
  () => {
    !unref(isFirstLoaded) && fetch()
  },
  { deep: true, immediate: props.immediate },
)

async function fetch() {
  const api = props.api
  if (!api || !isFunction(api) || loading.value)
    return
  options.value = []
  try {
    loading.value = true
    const res = await api(props.params)
    isFirstLoaded.value = true
    if (Array.isArray(res)) {
      options.value = res
      emitChange()
      return
    }
    if (props.resultField)
      options.value = get(res, props.resultField) || []

    emitChange()
  }
  catch (error) {
    console.warn(error)
  }
  finally {
    loading.value = false
    // reset status
    isFirstLoaded.value = false
  }
}

async function handleFetch(open: boolean) {
  if (open) {
    if (props.alwaysLoad)
      await fetch()
    else if (!props.immediate && !unref(isFirstLoaded))
      await fetch()
  }
}

function emitChange() {
  emit('options-change', unref(getOptions))
}

function handleChange(_, ...args) {
  emitData.value = args
}
</script>

<template>
  <Select
    v-bind="$attrs"
    v-model:value="state"
    :options="getOptions"
    @dropdown-visible-change="handleFetch"
    @change="handleChange"
  >
    <template v-for="item in Object.keys($slots)" #[item]="data">
      <slot :name="item" v-bind="data || {}" />
    </template>
    <template v-if="loading" #suffixIcon>
      <LoadingOutlined spin />
    </template>
    <template v-if="loading" #notFoundContent>
      <span>
        <LoadingOutlined spin class="mr-1" />
        {{ t('component.form.apiSelectNotFound') }}
      </span>
    </template>
  </Select>
</template>
