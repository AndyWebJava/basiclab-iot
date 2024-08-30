package com.basiclab.iot.device.controller.admin.product_properties.vo;

import lombok.*;
import io.swagger.v3.oas.annotations.media.Schema;
import com.basiclab.iot.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static com.basiclab.iot.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 产品模型属性分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ProductPropertiesPageReqVO extends PageParam {

    @Schema(description = "功能名称", example = "芋艿")
    private String propertyName;

    @Schema(description = "属性code")
    private String propertyCode;

    @Schema(description = "指示数据类型：取值范围：string、int、decimal（float和double都可以使用此类型）、DateTime、jsonObject上报数据时，复杂类型数据格式如下：	•DateTime:yyyyMMdd’T’HHmmss’Z’如:20151212T121212Z•jsonObject：自定义json结构体，平台不理解只透传", example = "1")
    private String datatype;

    @Schema(description = "属性描述，不影响实际功能，可配置为空字符串。", example = "你说的对")
    private String description;

    @Schema(description = "指示枚举值:如开关状态status可有如下取值enumList : [OPEN,CLOSE]目前本字段是非功能性字段，仅起到描述作用。建议准确定义。")
    private String enumlist;

    @Schema(description = "指示最大值。支持长度不超过50的数字。仅当dataType为int、decimal时生效，逻辑小于等于。")
    private String max;

    @Schema(description = "指示字符串长度。仅当dataType为string、DateTime时生效。")
    private Long maxlength;

    @Schema(description = "指示访问模式。R:可读；W:可写；E属性值更改时上报数据取值范围：R、RW、RE、RWE")
    private String method;

    @Schema(description = "指示最小值。支持长度不超过50的数字。仅当dataType为int、decimal时生效，逻辑大于等于。")
    private String min;

    @Schema(description = "指示本条属性是否必填，取值为0或1，默认取值1（必填）。目前本字段是非功能性字段，仅起到描述作用。(字典值link_product_isRequired：0非必填 1必填)")
    private Integer required;

    @Schema(description = "指示步长。")
    private Integer step;

    @Schema(description = "指示单位。支持长度不超过50。	取值根据参数确定，如：	•温度单位：“C”或“K”	•百分比单位：“%”	•压强单位：“Pa”或“kPa”")
    private String unit;

    @Schema(description = "创建者")
    private String createBy;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

    @Schema(description = "更新者")
    private String updateBy;

    @Schema(description = "模版code")
    private String templateCode;

    @Schema(description = "产品唯一标识", example = "9569")
    private String pid;

}