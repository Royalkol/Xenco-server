package com.nasus.mongodb.requestinfo;

import javax.validation.constraints.NotEmpty;

/**
 * Created by Royal on 2020/5/15
 * 登录请求报文参数
 */
public class RequestLoginInfo {

    @NotEmpty(message = "trainnumber不能为空")
    public String trainnumber;
    @NotEmpty(message = "password不能为空")
    public String password;

    public String getTrainnumber() {
        return trainnumber;
    }

    public void setTrainnumber(String trainnumber) {
        this.trainnumber = trainnumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
