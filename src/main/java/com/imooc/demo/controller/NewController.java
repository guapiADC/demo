package com.imooc.demo.controller;


import com.imooc.demo.entity.New;
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
@RequestMapping("/news")
public class    NewController {
    @Autowired
    NewService newService;

    /**
     * 获取所有的新闻信息
     *
     * @return
     */
    @RequestMapping(value = "/listnews", method = RequestMethod.GET)
    private Map<String, Object> listNew() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<New> list = new ArrayList<New>();
        // 获取新闻列表
        list = newService.getNewList();
        modelMap.put("newsList", list);
        return modelMap;
    }

    /**
     * 通过id获取新闻
     *
     * @return
     */
    @RequestMapping(value = "/getnewbyid", method = RequestMethod.GET)
    private Map<String, Object> latestNew(@RequestParam(value="id" ,required =false )int id) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取新闻
        New news = newService.getNewById(id);
        modelMap.put("newsList", news);
        return modelMap;
    }

    /**
     * 分页获取新闻信息
     *
     * @return
     */
    @RequestMapping(value = "/getnewbypage", method = RequestMethod.GET)
    private Map<String, Object> getLatestNew(@RequestParam(value="offset" ,required =false )int offset,
                                              @RequestParam(value="limit" ,required =false )int limit) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取区域信息
        List<New> list = newService.getLatestNew(offset,limit);
        modelMap.put("newlist", list);
        return modelMap;
    }

}
