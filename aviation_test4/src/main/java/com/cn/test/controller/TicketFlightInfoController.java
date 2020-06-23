package com.cn.test.controller;

import com.cn.test.entity.TicketFlightInfo;
import com.cn.test.service.TicketFlightInfoService;
import com.cn.test.util.Pager;
import com.cn.test.util.Return;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class TicketFlightInfoController {
    @Autowired
    private TicketFlightInfoService ticketFlightInfoService;

    Return res = new Return();

    /**
     *航班班机按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\progress\index.html
     */
    @RequestMapping(value = "delete3")
    @ResponseBody
    public Return delete3(int id){
        int i = ticketFlightInfoService.deleteByPrimaryKey(id);
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
    @RequestMapping(value = "edit3",method = RequestMethod.POST)
    @ResponseBody
    public int edit3(@RequestBody String jsonStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        JSONObject json = JSONObject.fromObject(jsonStr);
        TicketFlightInfo ticketFlightInfo = new TicketFlightInfo();
        ticketFlightInfo.setId(Integer.parseInt(json.getString("id")));
        ticketFlightInfo.setDate(sdf.parse(json.getString("date")));
        ticketFlightInfo.setFirstclass(Integer.parseInt(json.getString("firstclass")));
        ticketFlightInfo.setBussinessclass(Integer.parseInt(json.getString("bussinessclass")));
        ticketFlightInfo.setTouristclass(Integer.parseInt(json.getString("touristclass")));
        ticketFlightInfo.setFlight(Integer.parseInt(json.getString("flight")));
        ticketFlightInfo.setCutoff(Float.parseFloat(json.getString("cutoff")));
        return ticketFlightInfoService.updateByPrimaryKey(ticketFlightInfo);
    }

    /**
     *航班班机分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\progress\index.html
     */
    @RequestMapping(value = "page3")
    @ResponseBody
    public Return page3(HttpServletRequest request){
        return getaReturn(request, ticketFlightInfoService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketFlightInfoService ticketFlightInfoService, Return res) {
        Pager<TicketFlightInfo> pager = new Pager<TicketFlightInfo>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketFlightInfoService.selectAll());
        TicketFlightInfo[] ticketFlightInfos = pager.getSmallList().toArray(new TicketFlightInfo[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketFlightInfoService.count());
        res.setData(ticketFlightInfos);
        return res;
    }

    @RequestMapping(value = "addFlightInfo",method = RequestMethod.POST)
    @ResponseBody
    public int addFlightInfo(@RequestBody String jsonStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        JSONObject json = JSONObject.fromObject(jsonStr);
        TicketFlightInfo ticketFlightInfo = new TicketFlightInfo();
        ticketFlightInfo.setDate(sdf.parse(json.getString("date")));
        ticketFlightInfo.setFirstclass(Integer.parseInt(json.getString("firstclass")));
        ticketFlightInfo.setBussinessclass(Integer.parseInt(json.getString("bussinessclass")));
        ticketFlightInfo.setTouristclass(Integer.parseInt(json.getString("touristclass")));
        ticketFlightInfo.setFlight(Integer.parseInt(json.getString("flight")));
        ticketFlightInfo.setCutoff(Float.parseFloat(json.getString("cutoff")));
        return ticketFlightInfoService.insert(ticketFlightInfo);
    }

    @RequestMapping(value = "selectFlightDate")
    @ResponseBody
    public Return seclect(@RequestParam(value="startdate") String startdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startdate1 = sdf.parse(startdate);
        TicketFlightInfo[] ticketFlightInfos = ticketFlightInfoService.selectByDate(startdate1);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketFlightInfos.length);
        res.setData(ticketFlightInfos);
        return res;
    }
}
