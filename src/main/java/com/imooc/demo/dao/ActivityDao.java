package com.imooc.demo.dao;

import com.imooc.demo.entity.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityDao {
    //根据id查询活动
    Activity queryActivityById(@Param("id")int id);

    //查询所有活动
    List<Activity> queryActivity();

    //分页查询活动列表
    List<Activity> queryLatestActivity(@Param("offset") int offset,@Param("limit") int limit);
}
