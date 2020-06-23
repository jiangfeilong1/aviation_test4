package com.cn.test.entity;

import java.util.Date;

/**
 * @author Administrator
 */
public class TicketLogin {
    private Integer id;

    private String username;

    private String userip;

    private String userplatinfor;

    private Integer userinfor;

    private Date logintime;

    private Date logouttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserip() {
        return userip;
    }

    public void setUserip(String userip) {
        this.userip = userip == null ? null : userip.trim();
    }

    public String getUserplatinfor() {
        return userplatinfor;
    }

    public void setUserplatinfor(String userplatinfor) {
        this.userplatinfor = userplatinfor == null ? null : userplatinfor.trim();
    }

    public Integer getUserinfor() {
        return userinfor;
    }

    public void setUserinfor(Integer userinfor) {
        this.userinfor = userinfor;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getLogouttime() {
        return logouttime;
    }

    public void setLogouttime(Date logouttime) {
        this.logouttime = logouttime;
    }
}
