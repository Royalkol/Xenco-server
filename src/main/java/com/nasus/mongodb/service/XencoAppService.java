package com.nasus.mongodb.service;

import com.nasus.mongodb.requestinfo.Head;
import com.nasus.mongodb.requestinfo.RequestInfo;
import com.nasus.mongodb.responseinfo.ResponseInfo;

/**
 * Created by Royal on 2020/5/18
 */
public interface XencoAppService {
    /**
     * 校验系统访问权限
     */
    public String checkAppAuth(Head head);

    /**
     * 分析各种服务
     * @param requestInfo
     * @return
     */
    public ResponseInfo getXenco(RequestInfo requestInfo);
}
