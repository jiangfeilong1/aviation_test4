package com.cn.test.security;

import com.cn.test.util.Return;
import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class LoginHandler {
    Return res = new Return();

    @RequestMapping(value = "shirologin", method = RequestMethod.POST)
    @ResponseBody
    public Return shiroLogin(@RequestBody String jsonStr, HttpServletRequest req) {
        JSONObject json = JSONObject.fromObject(jsonStr);
        String username = json.getString("username");
        String password = json.getString("password");
        String vercode = json.getString("vercode");
        HttpSession session = req.getSession();
        String session1 = (String) session.getAttribute("validateCode");
        Subject currentUser = SecurityUtils.getSubject();
        if (vercode.equals(session1)) {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
            //认证登陆  EncryptKit.MD5(password)
            try {
                currentUser.login(usernamePasswordToken);
            } catch (UnknownAccountException e) {
                System.out.println("捕获异常UnknownAccountException");
                res = new Return(1, "账号错误");
                return res;
            } catch (IncorrectCredentialsException el) {
                System.out.println("捕获异常IncorrectCredentialsException");
                res = new Return(1, "密码错误");
                return res;
            }
        } else {
            System.out.println("验证码错误");
            res = new Return(1, "验证码错误");
            return res;
        }
        if (currentUser.isAuthenticated()){
            System.out.println("返回认证成功");
        }
        res = new Return(0, "登陆成功",username);
        session.setAttribute("username",username);
        return res;
    }



    @RequestMapping("shirologout")
    public String shiroLogout(){
        try {
            Subject subject = SecurityUtils.getSubject();
            if(subject.isAuthenticated()) {
                subject.logout();
                //登出成功
                return "redirect:/index";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/views/index";
    }


}
