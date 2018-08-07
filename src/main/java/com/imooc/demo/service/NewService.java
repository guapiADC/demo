package com.imooc.demo.service;

import com.imooc.demo.entity.New;

import java.util.List;
//实现业务功能的接口，也许会与数据库接口重合
public interface NewService {

    //根据id查询新闻
    New getNewById(int id);

    //返回新闻列表
    List<New> getNewList();

    //返回分页查询新闻列表
    List<New> getLatestNew(int offset,int limit);
}
