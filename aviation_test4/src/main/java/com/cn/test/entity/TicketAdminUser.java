package com.cn.test.entity;

/**
 * @author Administrator
 */
public class TicketAdminUser {
    private String username;

    private String password;

    private Integer rank;

    private String realname;

    private String description;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "TicketAdminUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rank=" + rank +
                ", realname='" + realname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
