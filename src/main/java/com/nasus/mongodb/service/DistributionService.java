package com.nasus.mongodb.service;

import com.nasus.mongodb.entity.XencoDistribution;
import com.nasus.mongodb.requestinfo.RequestDistributionInfo;
import com.nasus.mongodb.responseinfo.ResponseDistributionBody;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Royal on 2021/7/5
 */
public interface DistributionService {

    //新增配气数据
    void addDistribution();

    //查询配气数据
    XencoDistribution findDistinctByAgeAndLungCapacity(@RequestBody RequestDistributionInfo requestDistributionInfo);

    //计算氙气氧气配气时间
    ResponseDistributionBody getDistributionTime (RequestDistributionInfo requestDistributionInfo);
}
