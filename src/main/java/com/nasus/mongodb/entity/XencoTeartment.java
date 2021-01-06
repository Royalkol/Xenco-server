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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEuipmentserialnumber() {
        return euipmentserialnumber;
    }

    public void setEuipmentserialnumber(String euipmentserialnumber) {
        this.euipmentserialnumber = euipmentserialnumber;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public Date getTreatetime() {
        return treatetime;
    }

    public void setTreatetime(Date treatetime) {
        this.treatetime = treatetime;
    }

    public Date getTreatdate() {
        return treatdate;
    }

    public void setTreatdate(Date treatdate) {
        this.treatdate = treatdate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
