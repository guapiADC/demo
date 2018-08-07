package com.imooc.demo.dao;



import com.imooc.demo.entity.New;
import org.apache.ibatis.annotations.Param;

import java.util.List;


//操作数据库的接口
public interface NewDao {
    //根据id查询新闻
    New queryNewById(@Param("id")int id);

    //查询所有新闻
    List<New> queryNew();

    //分页查询新闻列表
    List<New> queryLatestNew(@Param("offset") int offset,@Param("limit") int limit);

}
