package com.hr.neo4j.controller;


import com.hr.neo4j.entity.EntityInfo;
import com.hr.neo4j.service.IEntityInfoService;
import com.hr.neo4j.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @since 2022-07-03
 */
@Api(tags = "接口")
@RestController
@RequestMapping("/neo4j/entity-info")
public class EntityInfoController {

    @Resource
    private IEntityInfoService entityInfoService;

    @GetMapping("/addEntityInfo")
    @ApiOperation(value = "添加entity-info")
    public Result addEntityInfo(EntityInfo entityInfo) {
        Boolean result = entityInfoService.addEntityInfo(entityInfo);
        return Result.success(result);
    }

    @GetMapping("/delEntityInfo/{entityInfoId}")
    @ApiOperation(value = "删除entity-info")
    public Result delEntityInfo(@PathVariable("entityInfoId") String entityInfoId) {
        Boolean result = entityInfoService.delEntityInfo(entityInfoId);
        return Result.success(result);
    }

    @GetMapping("/updateEntityInfo")
    @ApiOperation(value = "修改entity-info")
    public Result updateEntityInfo(EntityInfo entityInfo) {
        Boolean result = entityInfoService.updateEntityInfo(entityInfo);
        return Result.success(result);
    }

    @GetMapping("/getEntityInfo/{entityInfoId}")
    @ApiOperation(value = "查询entity-info")
    public Result getEntityInfo(@PathVariable("entityInfoId") String entityInfoId) {
        EntityInfo result = entityInfoService.getEntityInfo(entityInfoId);
        return Result.success(result);
    }

}

