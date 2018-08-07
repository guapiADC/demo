package com.imooc.demo.service;

import com.imooc.demo.entity.Activity;
import com.imooc.demo.entity.New;


import java.util.List;

public interface ActivityService {

    //根据id查询活动
    Activity getActivityById(int id);

    //返回活动列表
    List<Activity> getActivityList();

    //返回分页查询活动列表
    List<Activity> getLatestActivity(int offset,int limit);
}
