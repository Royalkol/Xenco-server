package com.nasus.mongodb.util;

import javax.validation.Validation;
import javax.validation.Validator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Royal on 2020/5/15
 */
public class ConstantUtil {
    public static Map<String,String> successMap=new HashMap<String,String>();    //返回代码
    public static  Map<String,String> serviceTypeMap=new HashMap<String,String>();//服务类型
    public static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
    static {
        successMap.put("0001","系统异常");
        successMap.put("0002","请求解析失败json无效");
        successMap.put("0003","用户无权限-appkey无效");
        successMap.put("0004","用户无权限—请求时间已过期");
        successMap.put("0005","用户无权限—key无效");
        successMap.put("0006","用户无权限—节点不合法");
        successMap.put("0007","用户无权限—服务类型无效");
        successMap.put("0008","用户无权限—无接口服务权限");


        serviceTypeMap.put("LOGIN","登陆");
    }
}
