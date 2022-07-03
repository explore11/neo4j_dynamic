package com.hr.neo4j.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @since 2022-07-03
 */
@Data
@EqualsAndHashCode()
@Accessors
@ApiModel(value = "EntityProperty对象", description = "")
public class EntityPropertyDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "属性名")
    private String entityPropertyName;


    @ApiModelProperty(value = "属性值")
    private String entityPropertyValue;


    @ApiModelProperty(value = "属性排序")
    private Integer entityPropertyOrder;


    @ApiModelProperty(value = "实体信息id")
    private String entityInfoId;


    @ApiModelProperty(value = "属性描述")
    private String entityPropertyDesc;


    @ApiModelProperty(value = "是否删除 0为false 1为true ")
    private Long isDelete;


    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;


    @ApiModelProperty(value = "创建人")
    private String createBy;


    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDate;


    @ApiModelProperty(value = "更新人")
    private LocalDateTime updateBy;


}
