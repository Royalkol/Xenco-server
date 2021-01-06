package com.nasus.mongodb.responseinfo;

import com.nasus.mongodb.vo.PhoneInfoVo;

/**
 * Created by Royal on 2020/5/20
 */
public class ResponsePhoneBody {
    private PhoneInfoVo traininfo;

    public PhoneInfoVo getTraininfo() {
        return traininfo;
    }

    public void setTraininfo(PhoneInfoVo traininfo) {
        this.traininfo = traininfo;
    }
}
