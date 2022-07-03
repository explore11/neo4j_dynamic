package com.hr.neo4j.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hr.neo4j.entity.EntityInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @since 2022-07-03
 */
public interface EntityInfoMapper extends BaseMapper<EntityInfo> {

    /**
     * 分页
     */
    IPage<EntityInfo> selectPage(@Param("page") Page page, @Param("entityInfo") EntityInfo entityInfo);
}
