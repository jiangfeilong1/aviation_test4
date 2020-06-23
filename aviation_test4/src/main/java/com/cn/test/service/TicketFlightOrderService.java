package com.cn.test.service;

import com.cn.test.entity.TicketFlightOrder;
import com.cn.test.entity.TicketFlightOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TicketFlightOrderService {
    int countByExample(TicketFlightOrderExample example);

    int deleteByExample(TicketFlightOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketFlightOrder record);

    int insertSelective(TicketFlightOrder record);

    List<TicketFlightOrder> selectByExample(TicketFlightOrderExample example);

    TicketFlightOrder selectByPrimaryKey(Integer id);

    List<TicketFlightOrder> selectAll();

    int count();

    int selectID();

    int updateByExampleSelective(@Param("record") TicketFlightOrder record, @Param("example") TicketFlightOrderExample example);

    int updateByExample(@Param("record") TicketFlightOrder record, @Param("example") TicketFlightOrderExample example);

    int updateByPrimaryKeySelective(TicketFlightOrder record);

    int updateByPrimaryKey(TicketFlightOrder record);
}
