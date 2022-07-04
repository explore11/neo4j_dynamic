package com.hr.neo4j.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @since 2022-07-03
 */
@Data
@EqualsAndHashCode()
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "EntityProperty对象", description = "")
public class EntityProperty {

    private static final long serialVersionUID = 1L;

    /**
     * 属性名
     */
    private String entityPropertyName;

    /**
     * 属性值
     */
    private String entityPropertyValue;

    /**
     * 属性排序
     */
    private Integer entityPropertyOrder;

    /**
     * 实体信息id
     */
    private String entityInfoId;

    /**
     * 属性描述
     */
    private String entityPropertyDesc;

    /**
     * 是否删除 0为false 1为true
     */
    @TableLogic
    private Integer isDelete;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 更新人
     */
    private LocalDateTime updateBy;


}
