package com.nasus.mongodb.requestinfo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * Created by Royal on 2021/7/5
 */
@Data
public class RequestDistributionInfo {
    @NotEmpty(message = "phonenumber不能为空")
    private int age;

    @NotEmpty(message = "sex不能为空")
    private String sex;

    @NotEmpty(message = "height")
    private int height;


}
