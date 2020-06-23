package com.cn.test.controller;

import com.cn.test.entity.Jing;
import com.cn.test.entity.TicketFlightOrder;
import com.cn.test.entity.ZhiFu;
import com.cn.test.service.JingService;
import com.cn.test.service.TicketFlightOrderService;
import com.cn.test.service.ZhiFuService;
import com.cn.test.util.Return;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class ZhiFuController {
    @Autowired
    private ZhiFuService zhiFuService;

    @Autowired
    private JingService jingService;

    @Autowired
    private TicketFlightOrderService ticketFlightOrderService;

    Return res = new Return();

    @RequestMapping(value = "addZhiFu",method = RequestMethod.POST)
    @ResponseBody
    public int addZhiFu(@RequestBody String jsonStr, HttpSession httpSession) {
        JSONObject json = JSONObject.fromObject(jsonStr);
        Integer id = Integer.parseInt(json.getString("id"));
        String username = json.getString("username");
        Integer orderid = Integer.parseInt(json.getString("orderid"));
        Jing jing = jingService.selectByUsername(username);
        Float hu = jing.getZhanghu();
        TicketFlightOrder ticketFlightOrder = ticketFlightOrderService.selectByPrimaryKey(orderid);
        Float hu1 = ticketFlightOrder.getPrice();
        Jing jing1 = new Jing();
        jing1.setZhanghu(hu - hu1);
        jing1.setId(jing.getId());
        jing1.setUsername(username);
        jingService.updateByPrimaryKeySelective(jing1);
        ZhiFu zhiFu = new ZhiFu();
        zhiFu.setId(id);
        zhiFu.setOrderid(orderid);
        zhiFu.setUsername(username);
        zhiFu.setZhuangtai("已支付");
        zhiFuService.updateByPrimaryKey(zhiFu);
        return zhiFuService.updateByPrimaryKey(zhiFu);
    }

    @RequestMapping(value = "quxiao",method = RequestMethod.POST)
    @ResponseBody
    public int quxiao(@RequestBody String jsonStr) {
        JSONObject json = JSONObject.fromObject(jsonStr);
        Integer id = Integer.parseInt(json.getString("id"));
        String username = json.getString("username");
        Integer orderid = Integer.parseInt(json.getString("orderid"));
        ZhiFu zhiFu = new ZhiFu();
        zhiFu.setId(id);
        zhiFu.setOrderid(orderid);
        zhiFu.setUsername(username);
        zhiFu.setZhuangtai("审核中");
        return zhiFuService.updateByPrimaryKey(zhiFu);
    }

    @RequestMapping(value = "tongguo",method = RequestMethod.POST)
    @ResponseBody
    public int tongguo(@RequestBody String jsonStr) {
        JSONObject json = JSONObject.fromObject(jsonStr);
        Integer id = Integer.parseInt(json.getString("id"));
        String username = json.getString("username");
        Integer orderid = Integer.parseInt(json.getString("orderid"));
        TicketFlightOrder ticketFlightOrder = ticketFlightOrderService.selectByPrimaryKey(orderid);
        Float price =  ticketFlightOrder.getPrice();
        ZhiFu zhiFu = new ZhiFu();
        zhiFu.setId(id);
        zhiFu.setOrderid(orderid);
        zhiFu.setUsername(username);
        zhiFu.setZhuangtai("已取消");
        return zhiFuService.updateByPrimaryKey(zhiFu);
    }

    @PostMapping(value = "selectZhiFu")
    @ResponseBody
    public Return selectZhiFu(@RequestParam(value="zhuangtai") String zhuangtai) {
        ZhiFu[] zhiFus = zhiFuService.selectByZhuangTai(zhuangtai);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(zhiFus.length);
        res.setData(zhiFus);
        return res;
    }

    @GetMapping (value = "selectAllZhiFu")
    @ResponseBody
    public Return selectAllZhiFu() {
        ZhiFu[] zhiFus = zhiFuService.selectAll();
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(zhiFus.length);
        res.setData(zhiFus);
        return res;
    }
}
