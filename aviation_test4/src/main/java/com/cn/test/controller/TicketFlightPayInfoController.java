package com.cn.test.controller;

import com.cn.test.entity.TicketFlightPayInfo;
import com.cn.test.service.TicketFlightPayInfoService;
import com.cn.test.util.Pager;
import com.cn.test.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class TicketFlightPayInfoController {
    @Autowired
    private TicketFlightPayInfoService ticketFlightPayInfoService;

    Return res = new Return();

    /**
     *航空公司按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "delete11")
    @ResponseBody
    public Return delete11(int id){
        int i = ticketFlightPayInfoService.deleteByPrimaryKey(id);
        res.setCode(i);
        res.setMsg("成功了");
        res.setTotal(0);
        res.setData(null);
        return res;
    }

    /**
     *航空公司按主键编辑
     * @param
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "edit11",method = RequestMethod.POST)
    @ResponseBody
    public int edit11(@RequestBody TicketFlightPayInfo record){
        return ticketFlightPayInfoService.updateByPrimaryKey(record);
    }

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "page11")
    @ResponseBody
    public Return page11(HttpServletRequest request){
        return getaReturn(request, ticketFlightPayInfoService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketFlightPayInfoService ticketFlightPayInfoService, Return res) {
        Pager<TicketFlightPayInfo> pager = new Pager<TicketFlightPayInfo>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketFlightPayInfoService.selectAll());
        TicketFlightPayInfo[] ticketFlightPayInfos = pager.getSmallList().toArray(new TicketFlightPayInfo[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketFlightPayInfoService.count());
        res.setData(ticketFlightPayInfos);
        return res;
    }

    @RequestMapping(value = "add5",method = RequestMethod.POST)
    @ResponseBody
    public int add5(@RequestBody TicketFlightPayInfo record){
        return ticketFlightPayInfoService.insert(record);
    }
}
