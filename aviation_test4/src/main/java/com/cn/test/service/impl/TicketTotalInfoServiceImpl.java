package com.cn.test.service.impl;

import com.cn.test.dao.TicketTotalInfoMapper;
import com.cn.test.entity.TicketTotalInfo;
import com.cn.test.entity.TicketTotalInfoExample;
import com.cn.test.service.TicketTotalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketTotalInfoServiceImpl implements TicketTotalInfoService {
    @Autowired
    private TicketTotalInfoMapper ticketTotalInfoMapper;

    public int countByExample(TicketTotalInfoExample example) {
        return 0;
    }

    public int deleteByExample(TicketTotalInfoExample example) {
        return 0;
    }

    public int insert(TicketTotalInfo record) {
        return 0;
    }

    public int insertSelective(TicketTotalInfo record) {
        return 0;
    }

    public List<TicketTotalInfo> selectAll() {
        return ticketTotalInfoMapper.selectAll();
    }

    public int count() {
        return ticketTotalInfoMapper.count();
    }

    public List<TicketTotalInfo> selectByExample(TicketTotalInfoExample example) {
        return null;
    }

    public int updateByExampleSelective(TicketTotalInfo record, TicketTotalInfoExample example) {
        return 0;
    }

    public int updateByExample(TicketTotalInfo record, TicketTotalInfoExample example) {
        return 0;
    }
}
