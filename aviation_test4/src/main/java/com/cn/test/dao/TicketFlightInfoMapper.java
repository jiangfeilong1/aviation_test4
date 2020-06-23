package com.cn.test.dao;

import com.cn.test.entity.TicketFlightInfo;
import com.cn.test.entity.TicketFlightInfoExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface TicketFlightInfoMapper {
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
