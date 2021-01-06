package com.nasus.mongodb.vo;

/**
 * Created by Royal on 2020/5/20
 */
public class PhoneInfoVo {
    /**
     * 返回信息* 成功或者失败
     */
    private String backmessage;

    /**
     * 0000成功
     * 0001失败
     */
    private String backStatus;

    private String trainnumber;

    public String getBackmessage() {
        return backmessage;
    }

    public void setBackmessage(String backmessage) {
        this.backmessage = backmessage;
    }

    public String getBackStatus() {
        return backStatus;
    }

    public void setBackStatus(String backStatus) {
        this.backStatus = backStatus;
    }

    public String getTrainnumber() {
        return trainnumber;
    }

    public void setTrainnumber(String trainnumber) {
        this.trainnumber = trainnumber;
    }
}

