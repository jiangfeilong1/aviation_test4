package com.cn.test.service;

import com.cn.test.entity.TicketFlightConfig;
import com.cn.test.entity.TicketFlightConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface TicketFlightConfigService {
    int countByExample(TicketFlightConfigExample example);

    int deleteByExample(TicketFlightConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketFlightConfig record);

    int insertSelective(TicketFlightConfig record);

    List<TicketFlightConfig> selectByExample(TicketFlightConfigExample example);

    TicketFlightConfig selectByPrimaryKey(Integer id);

    List<TicketFlightConfig> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketFlightConfig record, @Param("example") TicketFlightConfigExample example);

    int updateByExample(@Param("record") TicketFlightConfig record, @Param("example") TicketFlightConfigExample example);

    int updateByPrimaryKeySelective(TicketFlightConfig record);

    int updateByPrimaryKey(TicketFlightConfig record);
}
