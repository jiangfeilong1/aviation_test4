package com.cn.test.service;

import com.cn.test.entity.TicketAdminLoginInfo;
import com.cn.test.entity.TicketTotalInfo;
import com.cn.test.entity.TicketTotalInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface TicketTotalInfoService {
    int countByExample(TicketTotalInfoExample example);

    int deleteByExample(TicketTotalInfoExample example);

    int insert(TicketTotalInfo record);

    int insertSelective(TicketTotalInfo record);

    List<TicketTotalInfo> selectAll();

    int count();

    List<TicketTotalInfo> selectByExample(TicketTotalInfoExample example);

    int updateByExampleSelective(@Param("record") TicketTotalInfo record, @Param("example") TicketTotalInfoExample example);

    int updateByExample(@Param("record") TicketTotalInfo record, @Param("example") TicketTotalInfoExample example);
}
