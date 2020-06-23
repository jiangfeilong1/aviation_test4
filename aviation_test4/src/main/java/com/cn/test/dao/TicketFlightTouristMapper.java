package com.cn.test.dao;

import com.cn.test.entity.TicketFlightTourist;
import com.cn.test.entity.TicketFlightTouristExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface TicketFlightTouristMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TicketFlightTourist record);

    int insertSelective(TicketFlightTourist record);

    TicketFlightTourist selectByPrimaryKey(Integer id);

    List<TicketFlightTourist> selectAll();

    int count();

    int updateByPrimaryKeySelective(TicketFlightTourist record);

    int updateByPrimaryKey(TicketFlightTourist record);
}
