package com.cn.test.controller;

import com.cn.test.entity.TicketUser;
import com.cn.test.service.TicketUserService;
import com.cn.test.util.Pager;
import com.cn.test.util.Return;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class TicketUserController {
    @Autowired
    private TicketUserService ticketUserService;
    private HttpSession httpSession;

    Return res = new Return();

    public TicketUserController(HttpSession httpSession) {
        this.httpSession = httpSession;
    }

    /**
     *航空公司按主键删除
     * @param
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "delete5")
    @ResponseBody
    public Return delete5(String username){
        int i = ticketUserService.deleteByPrimaryKey(username);
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
    @RequestMapping(value = "edit5",method = RequestMethod.POST)
    @ResponseBody
    public int edit5(@RequestBody String jsonStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        JSONObject json = JSONObject.fromObject(jsonStr);
        TicketUser ticketUser = new TicketUser();
        ticketUser.setUsername(json.getString("username"));
        ticketUser.setAddress(json.getString("address"));
        ticketUser.setAnswer(json.getString("answer"));
        ticketUser.setCity(json.getString("city"));
        ticketUser.setDescription(json.getString("description"));
        ticketUser.setEmail(json.getString("email"));
        ticketUser.setPassword(json.getString("password"));
        ticketUser.setProvince(json.getString("province"));
        ticketUser.setRealname(json.getString("realname"));
        ticketUser.setRegdate(sdf.parse(json.getString("regdate")));
        ticketUser.setQuestion(json.getString("question"));
        ticketUser.setPhone(json.getString("phone"));
        return ticketUserService.updateByPrimaryKey(ticketUser);
    }

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "page5")
    @ResponseBody
    public Return page5(HttpServletRequest request){
        return getaReturn(request, ticketUserService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketUserService ticketUserService, Return res) {
        Pager<TicketUser> pager = new Pager<TicketUser>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketUserService.selectAll());
        TicketUser[] ticketUsers = pager.getSmallList().toArray(new TicketUser[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketUserService.count());
        res.setData(ticketUsers);
        return res;
    }

    @RequestMapping(value = "addTicketUser",method = RequestMethod.POST)
    @ResponseBody
    public Return add(@RequestBody String jsonStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        JSONObject json = JSONObject.fromObject(jsonStr);
        TicketUser ticketUser = new TicketUser();
        ticketUser.setUsername(json.getString("username"));
        ticketUser.setAddress(json.getString("address"));
        ticketUser.setAnswer(json.getString("answer"));
        ticketUser.setCity(json.getString("city"));
        ticketUser.setDescription(json.getString("description"));
        ticketUser.setEmail(json.getString("email"));
        ticketUser.setPassword(json.getString("password"));
        ticketUser.setProvince(json.getString("province"));
        ticketUser.setRealname(json.getString("realname"));
        ticketUser.setRegdate(sdf.parse(json.getString("regdate")));
        ticketUser.setQuestion(json.getString("question"));
        ticketUser.setPhone(json.getString("phone"));
        res.setCode(ticketUserService.insert(ticketUser));
        res.setMsg("成功了");
        res.setTotal(0);
        res.setData(null);
        return res;
    }

    @RequestMapping(value = "sessionTicketUser")
    @ResponseBody
    public Return sessionTicketUser() {
        String username = (String) httpSession.getAttribute("username");
        TicketUser ticketUser = ticketUserService.selectByPrimaryKey(username);
        TicketUser[] ticketUsers = new TicketUser[1];
        ticketUsers[0] = ticketUser;
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(1);
        res.setData(ticketUsers);
        return res;
    }
}
