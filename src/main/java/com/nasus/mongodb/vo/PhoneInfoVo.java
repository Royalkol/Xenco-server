package com.nasus.mongodb.vo;

import lombok.Data;

/**
 * Created by Royal on 2020/5/20
 */
@Data
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

}

