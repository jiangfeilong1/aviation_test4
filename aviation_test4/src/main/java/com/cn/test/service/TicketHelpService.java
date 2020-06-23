package com.cn.test.service;

import com.cn.test.entity.TicketHelp;
import com.cn.test.entity.TicketHelpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface TicketHelpService {
    int countByExample(TicketHelpExample example);

    int deleteByExample(TicketHelpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketHelp record);

    int insertSelective(TicketHelp record);

    List<TicketHelp> selectByExample(TicketHelpExample example);

    TicketHelp selectByPrimaryKey(Integer id);

    List<TicketHelp> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketHelp record, @Param("example") TicketHelpExample example);

    int updateByExample(@Param("record") TicketHelp record, @Param("example") TicketHelpExample example);

    int updateByPrimaryKeySelective(TicketHelp record);

    int updateByPrimaryKey(TicketHelp record);
}
