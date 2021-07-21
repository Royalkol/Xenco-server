package com.nasus.mongodb.entity;


import com.nasus.mongodb.util.AutoInc;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Royal on 2021/7/5
 * 配气实体类
 */
@Document(collection = "xencoDistribution")
@Data
@Accessors(chain = true)//实现链式编程
public class XencoDistribution {

    @Id
    @AutoInc
    private Long id = 0L;

    /**
     * 肺活量
     */
    private int lungCapacity;

    /**
     * 患者年龄
     */
    private int age;

    /**
     * 氧气
     */
    private int oxygen;


    /**
     * 氙气
     */
    private int Xenon;

    /**
     * 创建时间
     */
    private Date createdate;
    /**
     * 更新时间
     */
    private Date updatedate;
}
