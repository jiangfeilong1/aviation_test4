package com.cn.test.controller;

import com.cn.test.entity.TicketHelp;
import com.cn.test.service.TicketHelpService;
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
public class TicketHelpController {
    @Autowired
    private TicketHelpService ticketHelpService;

    Return res = new Return();

    /**
     *航空公司按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "delete8")
    @ResponseBody
    public Return delete8(int id){
        int i = ticketHelpService.deleteByPrimaryKey(id);
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
    @RequestMapping(value = "edit8",method = RequestMethod.POST)
    @ResponseBody
    public int edit8(@RequestBody TicketHelp record){
        return ticketHelpService.updateByPrimaryKey(record);
    }

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "page8")
    @ResponseBody
    public Return page8(HttpServletRequest request){
        return getaReturn(request, ticketHelpService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketHelpService ticketHelpService, Return res) {
        Pager<TicketHelp> pager = new Pager<TicketHelp>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketHelpService.selectAll());
        TicketHelp[] ticketHelps = pager.getSmallList().toArray(new TicketHelp[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketHelpService.count());
        res.setData(ticketHelps);
        return res;
    }

    @RequestMapping(value = "addTicketHelp",method = RequestMethod.POST)
    @ResponseBody
    public Return addTicketHelp(@RequestBody TicketHelp record){
        ticketHelpService.updateByPrimaryKey(record);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketHelpService.count());
        return res;
    }
}
