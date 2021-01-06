package com.nasus.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Royal on 2020/5/20
 */
@Data
@Document(collection = "xencoRequsetLog")
public class XencoRequsetLog {

    @Id
    private String id;

    /**请求系统*/
    private String requestapp;

    /**请求系统中文名*/
    private String requestappname;

    /**请求时间*/
    private Date requestdate;

    /**请求报文*/
    private String requestjson;

    /**响应时间*/
    private Date responsedate;

    /**响应报文*/
    private String responsejson;

    /**响应时间**/
    private int consumetime;

    public int getConsumetime() {
        return consumetime;
    }

    public void setConsumetime(int consumetime) {
        this.consumetime = consumetime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRequestapp() {
        return requestapp;
    }

    public void setRequestapp(String requestapp) {
        this.requestapp = requestapp;
    }

    public String getRequestappname() {
        return requestappname;
    }

    public void setRequestappname(String requestappname) {
        this.requestappname = requestappname;
    }

    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public String getRequestjson() {
        return requestjson;
    }

    public void setRequestjson(String requestjson) {
        this.requestjson = requestjson;
    }

    public Date getResponsedate() {
        return responsedate;
    }

    public void setResponsedate(Date responsedate) {
        this.responsedate = responsedate;
    }


    public String getResponsejson() {
        return responsejson;
    }

    public void setResponsejson(String responsejson) {
        this.responsejson = responsejson;
    }
}
