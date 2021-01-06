package com.nasus.mongodb.service.impl;

import com.nasus.mongodb.entity.XencoAppInfo;
import com.nasus.mongodb.requestinfo.Head;
import com.nasus.mongodb.requestinfo.RequestInfo;
import com.nasus.mongodb.requestinfo.RequestLoginInfo;
import com.nasus.mongodb.requestinfo.RequestPhoneInfo;
import com.nasus.mongodb.responseinfo.ResponseHead;
import com.nasus.mongodb.responseinfo.ResponseInfo;
import com.nasus.mongodb.service.XencoAppService;
import com.nasus.mongodb.util.ConstantUtil;
import com.nasus.mongodb.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import java.util.Set;

/**
 * Created by Royal on 2020/5/18
 */
@Service
public class XencoAppServiceImpl implements XencoAppService {

    public static final String USER_LOGIN = "LOGIN";
    public static final String USER_TRAIN = "TRAIN_NUMBER";
    @Autowired
    private UserServiceImpl userService;

    @Override
    public String checkAppAuth(Head requestHead) {
        String result = "0000";

        //验证服务类型 0007
        if (ConstantUtil.serviceTypeMap.get(requestHead.getService_type()) == null) {
            result = "0007";
            return result;
        }

        //key 验证 0005
//                String key = CheckKeyUtil.getKey(requestHead);
//                if (!key.equals(requestHead.getKey())) {
//                    result = "0005";
//                    return result;
//                }

        //时间戳验证  请求时间上下10分钟 0004
//                if (requestHead.getTime_tick() != null && !"".equals(requestHead.getTime_tick())) {
//                    long start = System.currentTimeMillis(); //获取当前时间
//                    long request = Long.parseLong(requestHead.getTime_tick());
//                    long inter = 10 * 60 * 1000l;//10分钟
//                    if (Math.abs(start - request) > inter) {
//                        result = "0004";
//                        return result;
//                    }
//                }

        //服务类型查找
        XencoAppInfo entity = getAppInfo(requestHead.getSys_code(), requestHead.getService_type());
        if (entity == null) {
            result = "0008";
            return result;
        } else {
            String appkeymd5 = Md5Util.MD5Encode(entity.getAppkey());
            if (!appkeymd5.equals(requestHead.getAppkeymd5().toUpperCase())) {
                result = "0003";
                return result;
            }

        }
        //校验通过
        return result;
    }

    @Override
    public ResponseInfo getXenco(RequestInfo requestInfo) {
        ResponseInfo responseInfo = new ResponseInfo();
        Head requestHead = requestInfo.getHead();

//        //验证Bean参数，并返回验证结果信息
        String errorCode = "0000";
        String errorMessage = "";
//
//        Set<ConstraintViolation<Head>> validators = ConstantUtil.validator.validate(requestHead);
//        for (ConstraintViolation<Head> constraintViolation : validators) {
//            errorMessage = errorMessage + constraintViolation.getMessage();
//        }
//        if (!errorMessage.equals("")) {
//            errorCode = "0006";
//        } else {
////            errorCode = this.checkAppAuth(requestHead);
//        }
        String serviceType = requestHead.getService_type();
        Object body = null;
        {
            if (USER_LOGIN.equals(serviceType)) {
                RequestLoginInfo requestLoginInfo = requestInfo.getBody().getLogininfo();
                if (requestLoginInfo != null) {
//                    Set<ConstraintViolation<RequestLoginInfo>> validatorsLogin = ConstantUtil.validator.validate(requestLoginInfo);
//                    for (ConstraintViolation<RequestLoginInfo> constraintViolation : validatorsLogin) {
//                        errorMessage = errorMessage + constraintViolation.getMessage();
//                    }
//                    if (!errorMessage.equals("")) {
//                        errorCode = "0006";
//                    } else {
                        body = userService.login(requestLoginInfo);
//                    }
                }
            }else if(USER_TRAIN.equals(serviceType)){//培训证号
                RequestPhoneInfo requestPhoneInfo=requestInfo.getBody().getPhoneinfo();
                body = userService.checkPhonNumber(requestPhoneInfo);
//            }else if(？.equals(serviceType)) {//患者信息接口
//
//            }else if(？.equals(serviceType)) {//设备信息接口
//
//            }else if(？.equals(serviceType)){//治疗信息保存接口
//
            }
            ResponseHead responseHead = new ResponseHead();
            responseHead.setSys_code(requestHead.getSys_code());
            responseHead.setError_code(errorCode);
            responseHead.setError_message(!errorMessage.equals("") ? errorMessage : ConstantUtil.successMap.get(errorCode));
            responseHead.setRequest_type(serviceType);
            responseInfo.setHead(responseHead);
            responseInfo.setBody(body);
            return responseInfo;
        }
    }

    public XencoAppInfo getAppInfo(String syscode, String servicetype) {
//                List<XencoAppInfo> list = xencoAppInfoRepository.findByCondition(syscode, servicetype);
//                if (list != null && list.size() > 0) {
//                    return list.get(0);
//                } else {
//                    return null;
//                }
        return null;
    }

}
