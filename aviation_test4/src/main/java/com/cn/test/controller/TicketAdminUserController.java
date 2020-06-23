package com.cn.test.controller;

import com.cn.test.entity.TicketAdminUser;
import com.cn.test.service.TicketAdminUserService;
import com.cn.test.util.Pager;
import com.cn.test.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class TicketAdminUserController {
    @Autowired
    private TicketAdminUserService ticketAdminUserService;

    Return res = new Return();

    /**
     *航空公司按主键删除
     * @param
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "delete6")
    @ResponseBody
    public Return delete6(String username){
        int i = ticketAdminUserService.deleteByPrimaryKey(username);
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
    @RequestMapping(value = "edit6",method = RequestMethod.POST)
    @ResponseBody
    public int edit6(@RequestBody TicketAdminUser record){
        return ticketAdminUserService.updateByPrimaryKey(record);
    }

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "page6")
    @ResponseBody
    public Return page6(HttpServletRequest request){
        return getaReturn(request, ticketAdminUserService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketAdminUserService ticketAdminUserService, Return res) {
        Pager<TicketAdminUser> pager = new Pager<TicketAdminUser>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketAdminUserService.selectAll());
        TicketAdminUser[] ticketAdminUsers = pager.getSmallList().toArray(new TicketAdminUser[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketAdminUserService.count());
        res.setData(ticketAdminUsers);
        return res;
    }

    @RequestMapping(value = "add3",method = RequestMethod.POST)
    @ResponseBody
    public int add3(@RequestBody TicketAdminUser record){
        return ticketAdminUserService.insert(record);
    }

}
