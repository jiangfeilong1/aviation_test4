package com.cn.test.dao;

import com.cn.test.entity.TicketNews;
import com.cn.test.entity.TicketNewsExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TicketNewsMapper {
    int countByExample(TicketNewsExample example);

    int deleteByExample(TicketNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketNews record);

    int insertSelective(TicketNews record);

    List<TicketNews> selectByExample(TicketNewsExample example);

    TicketNews selectByPrimaryKey(Integer id);

    List<TicketNews> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketNews record, @Param("example") TicketNewsExample example);

    int updateByExample(@Param("record") TicketNews record, @Param("example") TicketNewsExample example);

    int updateByPrimaryKeySelective(TicketNews record);

    int updateByPrimaryKey(TicketNews record);
}
