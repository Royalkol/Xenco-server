package com.nasus.mongodb.vo;

/**
 * Created by Royal on 2020/5/18
 */
public class LoginInfoVo {
    /**
     * 返回信息* 成功或者失败
     */
    private String backMessage;

    /**0000成功
     0001失败
     */
    private String backStatus;

    public String getBackMessage() {
        return backMessage;
    }

    public void setBackMessage(String backMessage) {
        this.backMessage = backMessage;
    }

    public String getBackStatus() {
        return backStatus;
    }

    public void setBackStatus(String backStatus) {
        this.backStatus = backStatus;
    }
}
