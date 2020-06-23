package com.cn.test.dao;

import com.cn.test.entity.TicketNews;
import com.cn.test.entity.TicketTotalInfo;
import com.cn.test.entity.TicketTotalInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketTotalInfoMapper {
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
