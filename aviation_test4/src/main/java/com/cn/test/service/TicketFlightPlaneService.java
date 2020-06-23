package com.cn.test.service;

import com.cn.test.entity.TicketFlightPlane;
import com.cn.test.entity.TicketFlightPlaneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface TicketFlightPlaneService {
    int countByExample(TicketFlightPlaneExample example);

    int deleteByExample(TicketFlightPlaneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketFlightPlane record);

    int insertSelective(TicketFlightPlane record);

    List<TicketFlightPlane> selectByExample(TicketFlightPlaneExample example);

    TicketFlightPlane selectByPrimaryKey(Integer id);

    List<TicketFlightPlane> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketFlightPlane record, @Param("example") TicketFlightPlaneExample example);

    int updateByExample(@Param("record") TicketFlightPlane record, @Param("example") TicketFlightPlaneExample example);

    int updateByPrimaryKeySelective(TicketFlightPlane record);

    int updateByPrimaryKey(TicketFlightPlane record);
}
