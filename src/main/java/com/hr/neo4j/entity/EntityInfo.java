package com.hr.neo4j.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value = "EntityInfo对象", description = "")
public class EntityInfo {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 实体名称
     */
    private String entityInfoName;

    /**
     * 实体标签
     */
    private String entityInfoLabel;

    /**
     * 实体类型id
     */
    private String entityTypeId;

    /**
     * 实体类型描述
     */
    private String entityInfoDesc;

    /**
     * 实体信息排序
     */
    private Integer entityInfoOrder;

    /**
     * 是否删除 0为false 1为true
     */
    @TableLogic
    private Integer isDelete;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 修改人
     */
    private String updateBy;


}
