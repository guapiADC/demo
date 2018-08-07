package com.imooc.demo.service.impl;

import com.imooc.demo.dao.ActivityDao;
import com.imooc.demo.entity.Activity;
import com.imooc.demo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ActivityServiceImpl implements ActivityService{

    @Autowired
    ActivityDao activityDao;

    @Override
    public Activity getActivityById(int id) {
        return activityDao.queryActivityById(id);
    }

    @Override
    public List<Activity> getActivityList() {
        return activityDao.queryActivity();
    }

    @Override
    public List<Activity> getLatestActivity(int offset, int limit) {
        return activityDao.queryLatestActivity(offset,limit);
    }
}
