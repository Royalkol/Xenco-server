package com.nasus.mongodb.requestinfo;

import javax.validation.constraints.NotEmpty;

/**
 * Created by Royal on 2020/5/20
 */
public class RequestPhoneInfo {
    @NotEmpty(message = "phonenumber不能为空")
    private  String phonenumber;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

}
