package com.basiclab.iot.device.controller.admin.product_commands_requests.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 产品模型设备下发服务命令属性 Response VO")
@Data
@ExcelIgnoreUnannotated
public class ProductCommandsRequestsRespVO {

    @Schema(description = "id", requiredMode = Schema.RequiredMode.REQUIRED, example = "24305")
    @ExcelProperty("id")
    private Long id;

    @Schema(description = "服务ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "7796")
    @ExcelProperty("服务ID")
    private Long serviceId;

    @Schema(description = "命令ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "28070")
    @ExcelProperty("命令ID")
    private Long commandsId;

    @Schema(description = "指示数据类型。取值范围：string、int、decimal	", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("指示数据类型。取值范围：string、int、decimal	")
    private String datatype;

    @Schema(description = "指示枚举值。	如开关状态status可有如下取值enumList : [OPEN,CLOSE]	目前本字段是非功能性字段，仅起到描述作用。建议准确定义。	")
    @ExcelProperty("指示枚举值。	如开关状态status可有如下取值enumList : [OPEN,CLOSE]	目前本字段是非功能性字段，仅起到描述作用。建议准确定义。	")
    private String enumlist;

    @Schema(description = "指示最大值。	仅当dataType为int、decimal时生效，逻辑小于等于。")
    @ExcelProperty("指示最大值。	仅当dataType为int、decimal时生效，逻辑小于等于。")
    private String max;

    @Schema(description = "指示字符串长度。	仅当dataType为string时生效。")
    @ExcelProperty("指示字符串长度。	仅当dataType为string时生效。")
    private String maxlength;

    @Schema(description = "指示最小值。	仅当dataType为int、decimal时生效，逻辑大于等于。")
    @ExcelProperty("指示最小值。	仅当dataType为int、decimal时生效，逻辑大于等于。")
    private String min;

    @Schema(description = "命令中参数的描述，不影响实际功能，可配置为空字符串。", example = "你说的对")
    @ExcelProperty("命令中参数的描述，不影响实际功能，可配置为空字符串。")
    private String parameterDescription;

    @Schema(description = "命令中参数的名字。", example = "王五")
    @ExcelProperty("命令中参数的名字。")
    private String parameterName;

    @Schema(description = "指示本条属性是否必填，取值为0或1，默认取值1（必填）。	目前本字段是非功能性字段，仅起到描述作用。", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("指示本条属性是否必填，取值为0或1，默认取值1（必填）。	目前本字段是非功能性字段，仅起到描述作用。")
    private String required;

    @Schema(description = "指示步长。")
    @ExcelProperty("指示步长。")
    private String step;

    @Schema(description = "指示单位。	取值根据参数确定，如：	•温度单位：“C”或“K”	•百分比单位：“%”	•压强单位：“Pa”或“kPa”	")
    @ExcelProperty("指示单位。	取值根据参数确定，如：	•温度单位：“C”或“K”	•百分比单位：“%”	•压强单位：“Pa”或“kPa”	")
    private String unit;

    @Schema(description = "创建者")
    @ExcelProperty("创建者")
    private String createBy;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新者")
    @ExcelProperty("更新者")
    private String updateBy;

}