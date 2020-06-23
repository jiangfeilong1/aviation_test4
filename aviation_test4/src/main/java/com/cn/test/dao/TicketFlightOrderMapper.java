package com.cn.test.dao;

import com.cn.test.entity.TicketFlight;
import com.cn.test.entity.TicketFlightOrder;
import com.cn.test.entity.TicketFlightOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface TicketFlightOrderMapper {
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
