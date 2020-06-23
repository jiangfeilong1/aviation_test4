package com.cn.test.controller;

import com.cn.test.entity.TicketFlightConfig;
import com.cn.test.service.TicketFlightConfigService;
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
public class TicketFlightConfigController {
    @Autowired
    private TicketFlightConfigService ticketFlightConfigService;

    Return res = new Return();

    /**
     *航班班机按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\progress\index.html
     */
    @RequestMapping(value = "delete4")
    @ResponseBody
    public Return delete4(int id){
        int i = ticketFlightConfigService.deleteByPrimaryKey(id);
        res.setCode(i);
        res.setMsg("成功了");
        res.setTotal(0);
        res.setData(null);
        return res;
    }

    /**
     *航班班机按主键编辑
     * @param
     * @return 全部数据 格式见Return类
     * component\progress\index.html
     */
    @RequestMapping(value = "edit4",method = RequestMethod.POST)
    @ResponseBody
    public int edit4(@RequestBody TicketFlightConfig record){
        return ticketFlightConfigService.updateByPrimaryKey(record);
    }

    /**
     *航班班机分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\progress\index.html
     */
    @RequestMapping(value = "page4")
    @ResponseBody
    public Return page4(HttpServletRequest request){
        return getaReturn(request, ticketFlightConfigService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketFlightConfigService ticketFlightConfigService, Return res) {
        Pager<TicketFlightConfig> pager = new Pager<TicketFlightConfig>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketFlightConfigService.selectAll());
        TicketFlightConfig[] ticketFlightPlanes = pager.getSmallList().toArray(new TicketFlightConfig[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketFlightConfigService.count());
        res.setData(ticketFlightPlanes);
        return res;
    }

    @RequestMapping(value = "add2",method = RequestMethod.POST)
    @ResponseBody
    public int add2(@RequestBody TicketFlightConfig record){
        return ticketFlightConfigService.insert(record);
    }
}
