package com.cn.test.controller;

import com.cn.test.entity.TicketTotalInfo;
import com.cn.test.service.TicketTotalInfoService;
import com.cn.test.util.Pager;
import com.cn.test.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class TicketTotalInfoController {
    @Autowired
    private TicketTotalInfoService ticketTotalInfoService;

    Return res = new Return();

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "page12")
    @ResponseBody
    public Return page12(HttpServletRequest request){
        return getaReturn(request, ticketTotalInfoService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketTotalInfoService ticketTotalInfoService, Return res) {
        Pager<TicketTotalInfo> pager = new Pager<TicketTotalInfo>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketTotalInfoService.selectAll());
        TicketTotalInfo[] ticketNews = pager.getSmallList().toArray(new TicketTotalInfo[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketTotalInfoService.count());
        res.setData(ticketNews);
        return res;
    }
}
