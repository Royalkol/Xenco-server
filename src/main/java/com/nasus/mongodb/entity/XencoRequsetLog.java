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

}
