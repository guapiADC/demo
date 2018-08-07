package com.imooc.demo.service.impl;

import com.imooc.demo.dao.NewDao;
import com.imooc.demo.entity.New;
import com.imooc.demo.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//服务接口的实现
@Service
public class NewServiceImpl implements NewService{
    @Autowired
    private NewDao newDao;
    @Override
    public New getNewById(int id) {

        return newDao.queryNewById(id);
    }

    @Override
    public List<New> getNewList() {

        return newDao.queryNew();
    }

    @Override
    public List<New> getLatestNew(int offset, int limit) {

        return newDao.queryLatestNew(offset,limit);
    }
}
