package com.cn.test.dao;

import com.cn.test.entity.TicketAdminLoginInfo;
import com.cn.test.entity.TicketAdminLoginInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface TicketAdminLoginInfoMapper {
    int countByExample(TicketAdminLoginInfoExample example);

    int deleteByExample(TicketAdminLoginInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketAdminLoginInfo record);

    int insertSelective(TicketAdminLoginInfo record);

    List<TicketAdminLoginInfo> selectByExample(TicketAdminLoginInfoExample example);

    TicketAdminLoginInfo selectByPrimaryKey(Integer id);

    List<TicketAdminLoginInfo> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketAdminLoginInfo record, @Param("example") TicketAdminLoginInfoExample example);

    int updateByExample(@Param("record") TicketAdminLoginInfo record, @Param("example") TicketAdminLoginInfoExample example);

    int updateByPrimaryKeySelective(TicketAdminLoginInfo record);

    int updateByPrimaryKey(TicketAdminLoginInfo record);

    List<TicketAdminLoginInfo> findAll();
}
