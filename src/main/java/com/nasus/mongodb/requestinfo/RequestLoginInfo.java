package com.nasus.mongodb.requestinfo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * Created by Royal on 2020/5/15
 * 登录请求报文参数
 */
@Data
public class RequestLoginInfo {

    @NotEmpty(message = "trainnumber不能为空")
    public String trainnumber;
    @NotEmpty(message = "password不能为空")
    public String password;


}
