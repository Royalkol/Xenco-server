package com.nasus.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Royal on 2020/5/9
 */
@Data
@Document(collection = "xencoUser")
public class XencoUser {
    @Id
    private String id;

    @NotNull
    /**培训证号*/
    private String trainnumber;

    /**密码*/
    private String password;

    /**电话号码*/
    private String phonenumber;

    /**新增时间*/
    private Date createtime;

    /**修改时间*/
    private Date updatetime;

    /**有效状态*/
    private    String  valistatus;

    /**备注*/
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getValistatus() {
        return valistatus;
    }

    public void setValistatus(String valistatus) {
        this.valistatus = valistatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "XencoUser{" +
                "id='" + id + '\'' +
                ", trainnumber='" + trainnumber + '\'' +
                ", password='" + password + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", valistatus='" + valistatus + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
