<script lang="ts" setup>
import { columns, searchFormSchema } from './message.data'
import { IconEnum } from '@/enums/appEnum'
import { BasicTable, TableAction, useTable } from '@/components/Table'
import { useI18n } from '@/hooks/web/useI18n'
import { getNotifyMessagePage } from '@/api/system/notify/message'
import MessageInfoModal from '@/views/system/notify/components/MessageInfoModal.vue'
import { useModal } from '@/components/Modal'

defineOptions({ name: 'SystemMessage' })

const { t } = useI18n()

const [registerTable] = useTable({
  title: '站内信记录列表',
  api: getNotifyMessagePage,
  columns,
  formConfig: { labelWidth: 120, schemas: searchFormSchema },
  useSearchForm: true,
  showTableSetting: true,
  showIndexColumn: false,
  actionColumn: {
    width: 100,
    title: t('common.action'),
    fixed: 'right',
    key: 'action',
  },
})

const [registerModal, { openModal }] = useModal()

function handleShowInfo(record: Recordable) {
  openModal(true, record)
}
</script>

<template>
  <div>
    <BasicTable @register="registerTable">
      <template #bodyCell="{ column, record }">
        <template v-if="column.key === 'action'">
          <TableAction
            :actions="[
              {
                label: t('action.detail'),
                icon: IconEnum.LOG,
                onClick: handleShowInfo.bind(null, record),
              },
            ]"
          />
        </template>
      </template>
    </BasicTable>
    <MessageInfoModal @register="registerModal" />
  </div>
</template>
