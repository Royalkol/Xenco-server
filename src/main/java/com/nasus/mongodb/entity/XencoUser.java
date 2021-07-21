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
