package com.cn.test.service;

import com.cn.test.entity.TicketFlight;
import com.cn.test.entity.TicketFlightExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
public interface TicketFlightService {
    int countByExample(TicketFlightExample example);

    int deleteByExample(TicketFlightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketFlight record);

    int insertSelective(TicketFlight record);

    List<TicketFlight> selectByExample(TicketFlightExample example);

    List<TicketFlight> selectByDate(Date startdate, Date enddate, String start, String destination);

    TicketFlight selectByPrimaryKey(Integer id);

    List<TicketFlight> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketFlight record, @Param("example") TicketFlightExample example);

    int updateByExample(@Param("record") TicketFlight record, @Param("example") TicketFlightExample example);

    int updateByPrimaryKeySelective(TicketFlight record);

    int updateByPrimaryKey(TicketFlight record);
}
