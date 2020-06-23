package com.cn.test.security;

import com.cn.test.entity.TicketAdminUser;
import com.cn.test.service.TicketAdminUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 */
public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private TicketAdminUserService ticketAdminUserService;
    private HttpSession httpSession;

    public ShiroRealm(HttpSession httpSession) {
        this.httpSession = httpSession;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo();
        return (AuthorizationInfo) authenticationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        String password = String.valueOf(usernamePasswordToken.getPassword());
        TicketAdminUser ticketAdminUser = ticketAdminUserService.selectByPrimaryKey(username);
        httpSession.setAttribute("ticketAdminUser",ticketAdminUser);
        if(ticketAdminUser == null) {
            System.out.println("没有账号");
            throw new UnknownAccountException("账号或密码错误");
        }
        if(!password.equals(ticketAdminUser.getPassword())){
            System.out.println("密码错误");
            throw new IncorrectCredentialsException("账号或密码错误");
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                ticketAdminUser.getUsername(), ticketAdminUser.getPassword(), getName());
        return simpleAuthenticationInfo;
    }
}
