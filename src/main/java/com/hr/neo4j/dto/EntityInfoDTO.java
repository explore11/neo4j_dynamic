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
@ApiModel(value = "EntityInfo对象", description = "")
public class EntityInfoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "实体名称")
    private String entityInfoName;


    @ApiModelProperty(value = "实体标签")
    private String entityInfoLabel;


    @ApiModelProperty(value = "实体类型id")
    private String entityTypeId;


    @ApiModelProperty(value = "实体类型描述")
    private String entityInfoDesc;


    @ApiModelProperty(value = "实体信息排序")
    private Integer entityInfoOrder;


    @ApiModelProperty(value = "是否删除 0为false 1为true ")
    private Long isDelete;


    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


    @ApiModelProperty(value = "创建人")
    private String createBy;


    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;


    @ApiModelProperty(value = "修改人")
    private String updateBy;


}
