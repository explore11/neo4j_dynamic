package com.hr.neo4j.utils;

import lombok.Data;

@Data
public class RequestVo {
    //private Sort sort;
    // 从0开始
    public int page;
    public int size;

}
