package com.nasus.mongodb.requestinfo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * Created by Royal on 2020/5/20
 */
@Data
public class RequestPhoneInfo {
    @NotEmpty(message = "phonenumber不能为空")
    private  String phonenumber;

}
