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
@ApiModel(value = "EntityType对象", description = "")
public class EntityTypeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private String id;


    @ApiModelProperty(value = "类型名字")
    private String typeName;


    @ApiModelProperty(value = "类型排序")
    private Integer typeOrder;


    @ApiModelProperty(value = "父id")
    private String parentId;


    @ApiModelProperty(value = "类型描述")
    private String typeDesc;


    @ApiModelProperty(value = "是否删除 0为false 1为true ")
    private Long isDelete;


    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;


    @ApiModelProperty(value = "创建人")
    private String createBy;


    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateDate;


    @ApiModelProperty(value = "修改人")
    private String updateBy;


}
