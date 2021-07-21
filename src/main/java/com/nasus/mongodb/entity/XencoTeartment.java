package com.nasus.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Royal on 2020/11/20
 */
@Data
public class XencoTeartment {
    @Id
    private String id;
    /**患者手机号码*/
    private String phonenumber;
    /**设备编号*/
    private String euipmentserialnumber;
    /**操作人*/
    private String operater;
    /**治疗所用时间*/
    private Date treatetime;
    /**治疗日期*/
    private Date treatdate;
    /**创建时间*/
    private Date createdate;
}
