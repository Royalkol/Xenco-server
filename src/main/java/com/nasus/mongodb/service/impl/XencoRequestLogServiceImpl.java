package com.nasus.mongodb.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.nasus.mongodb.entity.XencoRequsetLog;
import com.nasus.mongodb.jpa.XencoRequestLogRepository;
import com.nasus.mongodb.requestinfo.RequestInfo;
import com.nasus.mongodb.responseinfo.ResponseInfo;
import com.nasus.mongodb.service.XencoRequestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by Royal on 2020/5/18
 */
@Service
public class XencoRequestLogServiceImpl implements XencoRequestLogService {

    @Autowired
    private XencoRequestLogRepository xencoRequestLogRepository;

    @Override
    public void logRequest(String requestJson, RequestInfo requestInfo, Date requestDate, ResponseInfo responseInfo, Date responseDate) {
        XencoRequsetLog log = new XencoRequsetLog();
        if (requestInfo != null && requestInfo.getHead() != null) {
            log.setRequestapp(requestInfo.getHead().getSys_code());
            log.setRequestappname(requestInfo.getHead().getService_type());
        }
        log.setRequestdate(requestDate);
        log.setRequestjson(requestJson);
        log.setResponsedate(responseDate);
        log.setResponsejson(JSONObject.toJSONString(responseInfo));
        int interval = (int) (responseDate.getTime() - requestDate.getTime());
        log.setConsumetime(interval);
        this.addxencoRequsetLog(log);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public XencoRequsetLog addxencoRequsetLog(XencoRequsetLog xencoRequsetLog) {
        return xencoRequestLogRepository.save(xencoRequsetLog);
    }
}
