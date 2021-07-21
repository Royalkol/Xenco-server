package com.nasus.mongodb.vo;

import lombok.Data;

/**
 * @USER: Royal
 * @DATE: 2021/7/7
 */
@Data
public class DistributionInfoVo {
    /**
     * 返回信息* 成功或者失败
     */
    private String backMessage;

    /**
     * 0000成功
     * 0001失败
     */
    private String backStatus;

    private int oxygenTime;
    private int xenonTime;

}
