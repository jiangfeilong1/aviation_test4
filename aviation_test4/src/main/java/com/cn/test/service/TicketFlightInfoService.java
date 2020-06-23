package com.cn.test.service;

import com.cn.test.entity.TicketFlightInfo;
import com.cn.test.entity.TicketFlightInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
public interface TicketFlightInfoService {
    int countByExample(TicketFlightInfoExample example);

    int deleteByExample(TicketFlightInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketFlightInfo record);

    int insertSelective(TicketFlightInfo record);

    List<TicketFlightInfo> selectByExample(TicketFlightInfoExample example);

    TicketFlightInfo selectByPrimaryKey(Integer id);

    TicketFlightInfo[] selectByDate(Date date);

    List<TicketFlightInfo> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketFlightInfo record, @Param("example") TicketFlightInfoExample example);

    int updateByExample(@Param("record") TicketFlightInfo record, @Param("example") TicketFlightInfoExample example);

    int updateByPrimaryKeySelective(TicketFlightInfo record);

    int updateByPrimaryKey(TicketFlightInfo record);
}
