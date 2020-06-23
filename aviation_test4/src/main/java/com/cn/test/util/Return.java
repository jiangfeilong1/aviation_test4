package com.cn.test.util;

import java.util.Arrays;

/**
 * @author Administrator
 */
public class Return<T> {
    private int code;
    private String msg;
    private int total;
    private T[] data;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTotal() {
        return total;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public Return(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Return(int code, String msg, int total, T[] data) {
        this.code = code;
        this.msg = msg;
        this.total = total;
        this.data = data;
    }

    public Return() {
    }

    public Return(int code, String msg, String username) {
        this.code = code;
        this.msg = msg;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Return{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", total=" + total +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
