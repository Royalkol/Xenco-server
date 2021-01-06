package com.nasus.mongodb.requestinfo;

/**
 * Created by Royal on 2020/5/15
 */
public class Body {
    private RequestLoginInfo logininfo;
    private RequestPhoneInfo phoneinfo;


    public RequestLoginInfo getLogininfo() {
        return logininfo;
    }

    public void setLogininfo(RequestLoginInfo logininfo) {
        this.logininfo = logininfo;
    }

    public RequestPhoneInfo getPhoneinfo() {
        return phoneinfo;
    }

    public void setPhoneinfo(RequestPhoneInfo phoneinfo) {
        this.phoneinfo = phoneinfo;
    }
}
