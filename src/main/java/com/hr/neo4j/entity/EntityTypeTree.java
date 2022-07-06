package com.hr.neo4j.entity;

import lombok.Data;

import java.util.List;

@Data
public class EntityTypeTree {
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
     * 是否删除 0为false 1为true
     */
    private Integer isDelete;


    private List<EntityType> children;
}
