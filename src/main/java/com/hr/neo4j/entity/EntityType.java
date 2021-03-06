package com.hr.neo4j.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @since 2022-07-03
 */
@Data
@EqualsAndHashCode()
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "EntityType对象", description = "")
public class EntityType {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 类型名字
     */
    private String typeName;

    /**
     * 类型排序
     */
    private Integer typeOrder;

    /**
     * 父id
     */
    private String parentId;

    /**
     * 类型描述
     */
    private String typeDesc;

    /**
     * 是否是节点 0为false 1为true
     */
    private Integer isNode;


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
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 修改人
     */
    private String updateBy;



    @TableField(exist = false)
    private List<EntityType> children;

}
