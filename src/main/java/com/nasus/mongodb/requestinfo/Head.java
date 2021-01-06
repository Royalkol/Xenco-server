package com.nasus.mongodb.requestinfo;

import javax.validation.constraints.NotEmpty;

/**
 * Created by Royal on 2020/5/15
 */
public class Head {
    @NotEmpty(message = "sys_code不能为空")
    private String sys_code;
    @NotEmpty(message = "appkeymd5不能为空")
    private String appkeymd5;


    private String time_tick;

    @NotEmpty(message = "service_type不能为空")
    private String service_type;

    @NotEmpty(message = "key不能为空")
    private String key;

    public String getSys_code() {
        return sys_code;
    }

    public void setSys_code(String sys_code) {
        this.sys_code = sys_code;
    }

    public String getAppkeymd5() {
        return appkeymd5;
    }

    public void setAppkeymd5(String appkeymd5) {
        this.appkeymd5 = appkeymd5;
    }

    public String getTime_tick() {
        return time_tick;
    }

    public void setTime_tick(String time_tick) {
        this.time_tick = time_tick;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
