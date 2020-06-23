package com.cn.test.service;

import com.cn.test.entity.TicketFlightTourist;
import com.cn.test.entity.TicketFlightTouristExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface TicketFlightTouristService {
    int countByExample(TicketFlightTouristExample example);

    int deleteByExample(TicketFlightTouristExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketFlightTourist record);

    int insertSelective(TicketFlightTourist record);

    List<TicketFlightTourist> selectByExample(TicketFlightTouristExample example);

    TicketFlightTourist selectByPrimaryKey(Integer id);

    List<TicketFlightTourist> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketFlightTourist record, @Param("example") TicketFlightTouristExample example);

    int updateByExample(@Param("record") TicketFlightTourist record, @Param("example") TicketFlightTouristExample example);

    int updateByPrimaryKeySelective(TicketFlightTourist record);

    int updateByPrimaryKey(TicketFlightTourist record);
}
