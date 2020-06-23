package com.cn.test.service;

import com.cn.test.entity.TicketAdminUser;
import com.cn.test.entity.TicketAdminUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface TicketAdminUserService {
    int countByExample(TicketAdminUserExample example);

    int deleteByExample(TicketAdminUserExample example);

    int deleteByPrimaryKey(String username);

    int insert(TicketAdminUser record);

    int insertSelective(TicketAdminUser record);

    List<TicketAdminUser> selectByExample(TicketAdminUserExample example);

    TicketAdminUser selectByPrimaryKey(String username);

    List<TicketAdminUser> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketAdminUser record, @Param("example") TicketAdminUserExample example);

    int updateByExample(@Param("record") TicketAdminUser record, @Param("example") TicketAdminUserExample example);

    int updateByPrimaryKeySelective(TicketAdminUser record);

    int updateByPrimaryKey(TicketAdminUser record);
}
