package com.cn.test.dao;

import com.cn.test.entity.TicketLogin;
import com.cn.test.entity.TicketLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketLoginMapper {
    int countByExample(TicketLoginExample example);

    int deleteByExample(TicketLoginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketLogin record);

    int insertSelective(TicketLogin record);

    List<TicketLogin> selectByExample(TicketLoginExample example);

    TicketLogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TicketLogin record, @Param("example") TicketLoginExample example);

    int updateByExample(@Param("record") TicketLogin record, @Param("example") TicketLoginExample example);

    int updateByPrimaryKeySelective(TicketLogin record);

    int updateByPrimaryKey(TicketLogin record);
}