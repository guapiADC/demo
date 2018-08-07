package com.imooc.demo.controller;


import com.imooc.demo.entity.Activity;
import com.imooc.demo.entity.New;
import com.imooc.demo.service.ActivityService;
import com.imooc.demo.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    ActivityService activityService;

    /**
     * 获取所有的活动信息
     *
     * @return
     */
    @RequestMapping(value = "/listactivity", method = RequestMethod.GET)
    private Map<String, Object> listActivity() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Activity> list = new ArrayList<Activity>();
        // 获取活动列表
        list = activityService.getActivityList();
        modelMap.put("newsList", list);
        return modelMap;
    }

    /**
     * 通过id获取活动
     *
     * @return
     */
    @RequestMapping(value = "/getactivitybyid", method = RequestMethod.GET)
    private Map<String, Object> latestActivity(@RequestParam(value="id" ,required =false )int id) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取活动
        Activity activity = activityService.getActivityById(id);
        modelMap.put("newsList", activity);
        return modelMap;
    }

    /**
     * 分页获取活动信息
     *
     * @return
     */
    @RequestMapping(value = "/getactivitybypage", method = RequestMethod.GET)
    private Map<String, Object> getLatestActivity(@RequestParam(value="offset" ,required =false )int offset,
                                             @RequestParam(value="limit" ,required =false )int limit) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取活动信息
        List<Activity> list = activityService.getLatestActivity(offset,limit);
        modelMap.put("activitylist", list);
        return modelMap;
    }

}
