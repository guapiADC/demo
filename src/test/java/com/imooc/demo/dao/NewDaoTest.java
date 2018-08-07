package com.imooc.demo.dao;

import com.imooc.demo.entity.New;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewDaoTest {

    @Autowired
    private  NewDao newDao;

    @Test
    public void queryNewById() throws Exception {
        New news = newDao.queryNewById(3);
        assertEquals("3",news.getTitle());
        System.out.println(news.getImageUrl());
    }

    @Test
    public void queryNew() throws Exception {
        List<New> newList=newDao.queryNew();
        assertEquals(7,newList.size());
    }

    @Test
    public void queryLatestNew() throws Exception {
        List<New> newList = newDao.queryLatestNew(2,3);
        assertEquals(3,newList.size());

    }

}