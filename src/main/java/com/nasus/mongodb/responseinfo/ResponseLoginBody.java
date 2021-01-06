package com.nasus.mongodb.responseinfo;

import com.nasus.mongodb.vo.LoginInfoVo;

/**
 * Created by Royal on 2020/5/18
 */
public class ResponseLoginBody {
    private LoginInfoVo resultinfo;

    public LoginInfoVo getResultinfo() {
        return resultinfo;
    }

    public void setResultinfo(LoginInfoVo resultinfo) {
        this.resultinfo = resultinfo;
    }
}
