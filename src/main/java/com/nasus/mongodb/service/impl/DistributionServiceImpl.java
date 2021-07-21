package com.nasus.mongodb.service.impl;

import com.nasus.mongodb.entity.XencoDistribution;
import com.nasus.mongodb.jpa.DistributionRepository;
import com.nasus.mongodb.requestinfo.RequestDistributionInfo;
import com.nasus.mongodb.responseinfo.ResponseDistributionBody;
import com.nasus.mongodb.service.DistributionService;
import com.nasus.mongodb.vo.DistributionInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @USER: Royal
 * @DATE: 2021/7/5
 */
@Service
public class DistributionServiceImpl implements DistributionService {

    @Autowired
    private DistributionRepository distributionRepository;

    private int age;
    private String sex;
    private int height;
    private int lungCapacity;
    private int oxygen;
    private int xenon;
    private int oxygenTime;
    private int xenonTime;
    private double maleCoefficientHeight = 0.052;
    //进去速率
    private double amissionRate = 16.6;
    private double maleCoefficientAge = 0.029;
    private double femaleCoefficientfeHeight = 0.049;
    private double femalemaleCoefficientAge = 0.019;
    private XencoDistribution xencoDistribution;

    @Override
    public void addDistribution() {
        XencoDistribution xencoDistribution = new XencoDistribution();
//        xencoDistribution.setLungCapacity("3000");
//        xencoDistribution.setAge("39");
//        xencoDistribution.setOxygen("400");
//        xencoDistribution.setXenon("1300");
//        xencoDistribution.setCreatedate(new Date());
//        xencoDistribution.setUpdatedate(new Date());
//        distributionRepository.save(xencoDistribution);
    }


    @Override
    public XencoDistribution findDistinctByAgeAndLungCapacity(RequestDistributionInfo requestDistributionInfo) {
        XencoDistribution xencoDistribution = new XencoDistribution();
        age = requestDistributionInfo.getAge();
        sex = requestDistributionInfo.getSex();
        height = requestDistributionInfo.getHeight();
        //计算肺活量
        if ("male".equals(sex)) {
            lungCapacity = (int) ((maleCoefficientHeight * height
                    - maleCoefficientAge * age - 3.2) * 1000);
        } else {
            lungCapacity = (int) ((femaleCoefficientfeHeight * height
                    - femalemaleCoefficientAge * age - 3.9) * 1000);
        }
        //处理肺活量这个数值
        if (lungCapacity <= 3000) {
            lungCapacity = 3000;
        } else if (lungCapacity > 3000 && lungCapacity <= 4000) {
            lungCapacity = 4000;
        } else if (lungCapacity > 4000 && lungCapacity <= 5000) {
            lungCapacity = 5000;
        } else if (lungCapacity > 5000 && lungCapacity <= 6000) {
            lungCapacity = 6000;
        }

        //处理年龄这个值
        if (age >= 19 && age <= 39) {
            age = 39;
        } else if (age >= 40 && age <= 49) {
            age = 49;
        } else if (age >= 50 && age <= 59) {
            age = 59;
        } else if (age >= 60 && age <= 69) {
            age = 69;
        }

        xencoDistribution = distributionRepository.findDistinctByAgeAndLungCapacity(String.valueOf(age), String.valueOf(lungCapacity));
        System.out.println(xencoDistribution);
        return xencoDistribution;
    }
 
    @Override
    public ResponseDistributionBody getDistributionTime(RequestDistributionInfo requestDistributionInfo) {
        String backMessage = "成功";
        String backStatus = "0000";
        xencoDistribution = this.findDistinctByAgeAndLungCapacity(requestDistributionInfo);
        //获取对应的氙气 氧气量
        oxygen = xencoDistribution.getOxygen();
        xenon = xencoDistribution.getXenon();
        oxygenTime = (int) (oxygen / amissionRate);
        xenonTime = (int) (xenon / amissionRate);
        DistributionInfoVo distributionInfoVo = new DistributionInfoVo();
        distributionInfoVo.setBackMessage(backMessage);
        distributionInfoVo.setBackStatus(backStatus);
        distributionInfoVo.setOxygenTime(oxygenTime);
        distributionInfoVo.setXenonTime(xenonTime);
        ResponseDistributionBody responseDistributionBody = new ResponseDistributionBody();
        responseDistributionBody.setDistribution(distributionInfoVo);
        System.out.println(responseDistributionBody);
        return responseDistributionBody;
    }
}
