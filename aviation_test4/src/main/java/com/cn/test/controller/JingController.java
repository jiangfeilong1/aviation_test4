package com.cn.test.controller;

import com.cn.test.entity.Jing;
import com.cn.test.service.JingService;
import com.cn.test.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "test")
public class JingController {
    @Autowired
    private JingService jingService;

    Return res = new Return();

    @RequestMapping(value = "chakan")
    @ResponseBody
    public Return chaKan(HttpSession httpSession) {
        String username = (String) httpSession.getAttribute("username");
        Jing jing = jingService.selectByUsername(username);
        Jing[] Jings = new Jing[1];
        Jings[0] = jing;
        res.setMsg("成功了");
        res.setTotal(1);
        res.setCode(0);
        res.setData(Jings);
        return res;
    }
}
