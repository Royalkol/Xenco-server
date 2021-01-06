package com.nasus.mongodb.service;

import com.nasus.mongodb.entity.XencoRequsetLog;
import com.nasus.mongodb.requestinfo.RequestInfo;
import com.nasus.mongodb.responseinfo.ResponseInfo;

import java.util.Date;

/**
 * Created by Royal on 2020/5/15
 */
public interface XencoRequestLogService {

    /**
     * 处理保存日志
     */
    public void logRequest(String requestJson, RequestInfo requestInfo, Date requestDate, ResponseInfo responseInfo, Date responseDate);

    /**
     * 新增日志
     * @param xencoRequsetLog
     * @return
     */
    XencoRequsetLog addxencoRequsetLog(XencoRequsetLog xencoRequsetLog);

}
