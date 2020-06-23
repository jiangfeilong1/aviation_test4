package com.cn.test.dao;

import com.cn.test.entity.TicketUser;
import com.cn.test.entity.TicketUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
public interface TicketUserMapper {
    int countByExample(TicketUserExample example);

    int deleteByExample(TicketUserExample example);

    int deleteByPrimaryKey(String username);

    int insert(TicketUser record);

    int insertSelective(TicketUser record);

    List<TicketUser> selectByExample(TicketUserExample example);

    TicketUser selectByPrimaryKey(String username);

    List<TicketUser> selectAll();

    int count();

    int updateByExampleSelective(@Param("record") TicketUser record, @Param("example") TicketUserExample example);

    int updateByExample(@Param("record") TicketUser record, @Param("example") TicketUserExample example);

    int updateByPrimaryKeySelective(TicketUser record);

    int updateByPrimaryKey(TicketUser record);
}
