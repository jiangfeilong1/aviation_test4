package com.cn.test.dao;

import com.cn.test.entity.TicketFlightCompany;
import com.cn.test.entity.TicketFlightCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface TicketFlightCompanyMapper {
    int countByExample(TicketFlightCompanyExample example);

    int deleteByExample(TicketFlightCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketFlightCompany record);

    int insertSelective(TicketFlightCompany record);

    List<TicketFlightCompany> selectByExample(TicketFlightCompanyExample example);

    List<TicketFlightCompany> selectAll();

    int count();

    TicketFlightCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TicketFlightCompany record, @Param("example") TicketFlightCompanyExample example);

    int updateByExample(@Param("record") TicketFlightCompany record, @Param("example") TicketFlightCompanyExample example);

    int updateByPrimaryKeySelective(TicketFlightCompany record);

    int updateByPrimaryKey(TicketFlightCompany record);
}
