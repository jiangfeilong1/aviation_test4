package com.cn.test.dao;

import com.cn.test.entity.TicketFlightPayInfo;
import com.cn.test.entity.TicketFlightPayInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface TicketFlightPayInfoMapper {
    int countByExample(TicketFlightPayInfoExample example);

    int deleteByExample(TicketFlightPayInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketFlightPayInfo record);

    int insertSelective(TicketFlightPayInfo record);

    List<TicketFlightPayInfo> selectByExample(TicketFlightPayInfoExample example);

    TicketFlightPayInfo selectByPrimaryKey(Integer id);

    List<TicketFlightPayInfo> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketFlightPayInfo record, @Param("example") TicketFlightPayInfoExample example);

    int updateByExample(@Param("record") TicketFlightPayInfo record, @Param("example") TicketFlightPayInfoExample example);

    int updateByPrimaryKeySelective(TicketFlightPayInfo record);

    int updateByPrimaryKey(TicketFlightPayInfo record);
}
