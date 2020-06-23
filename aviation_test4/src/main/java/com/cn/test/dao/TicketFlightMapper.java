package com.cn.test.dao;

import com.cn.test.entity.TicketFlight;
import com.cn.test.entity.TicketFlightExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface TicketFlightMapper {
    int countByExample(TicketFlightExample example);

    int deleteByExample(TicketFlightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketFlight record);

    int insertSelective(TicketFlight record);

    List<TicketFlight> selectByDate(@Param("startdate") Date startdate,@Param("enddate") Date enddate,@Param("start") String start,@Param("destination") String destination);

    List<TicketFlight> selectByExample(TicketFlightExample example);

    TicketFlight selectByPrimaryKey(Integer id);

    List<TicketFlight> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketFlight record, @Param("example") TicketFlightExample example);

    int updateByExample(@Param("record") TicketFlight record, @Param("example") TicketFlightExample example);

    int updateByPrimaryKeySelective(TicketFlight record);

    int updateByPrimaryKey(TicketFlight record);
}
