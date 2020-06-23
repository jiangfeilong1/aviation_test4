package com.cn.test.security;

import com.cn.test.entity.TicketUser;
import com.cn.test.service.TicketUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 */
public class SecondRealm extends AuthorizingRealm {
    @Autowired
    private TicketUserService ticketUserService;
    private HttpSession httpSession;

    public SecondRealm(HttpSession httpSession) {
        this.httpSession = httpSession;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        String password = String.valueOf(usernamePasswordToken.getPassword());
        TicketUser ticketUser = ticketUserService.selectByPrimaryKey(username);
        httpSession.setAttribute("ticketUser",ticketUser);
        if(ticketUser == null) {
            System.out.println("没有账号");
            throw new UnknownAccountException("账号或密码错误");
        }
        if(!password.equals(ticketUser.getPassword())){
            System.out.println("密码错误");
            throw new IncorrectCredentialsException("账号或密码错误");
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                ticketUser.getUsername(), ticketUser.getPassword(), getName());
        return simpleAuthenticationInfo;
    }
}
