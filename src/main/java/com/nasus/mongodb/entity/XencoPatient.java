package com.nasus.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Royal on 2020/11/20
 */
@Data
public class XencoPatient {

    @Id
    private String id;
    /**性别*/
    private String sex;
    /**手机号码(作为唯一标识)*/
    private String phoneNumber;
    /**年龄*/
    private String age;
    /**身高*/
    private String height;
    /**体重*/
    private String weight;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;

}
