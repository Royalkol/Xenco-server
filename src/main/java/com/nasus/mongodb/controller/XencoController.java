package com.nasus.mongodb.controller;

import com.alibaba.fastjson.JSONObject;
import com.nasus.mongodb.requestinfo.RequestInfo;
import com.nasus.mongodb.responseinfo.ResponseHead;
import com.nasus.mongodb.responseinfo.ResponseInfo;
import com.nasus.mongodb.service.XencoAppService;
import com.nasus.mongodb.service.XencoRequestLogService;
import com.nasus.mongodb.util.ConstantUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Royal on 2020/5/12
 */
@Controller
@RequestMapping("/xenco")
public class XencoController {

    @Autowired
    private XencoAppService xencoAppService;
    @Autowired
    private XencoRequestLogService xencoRequestLogService;

    //录方法
    @ResponseBody
    @RequestMapping(value = "/getXencoInfo", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String login(@RequestBody JSONObject jsonParam) {
        String requestJson = jsonParam.toJSONString();
        RequestInfo info = JSONObject.parseObject(requestJson, RequestInfo.class);
        ResponseInfo responseInfo = new ResponseInfo();
        ResponseHead head = new ResponseHead();
        Date requestDate = new Date();
        try {
            if (info == null || info.getHead() == null || info.getBody() == null) {
                //报文传入缺失 返回解析失败
                head.setError_code("0002");
                head.setError_message(ConstantUtil.successMap.get("0002"));
                responseInfo.setHead(head);
            } else {
                responseInfo = xencoAppService.getXenco(info);
            }
        } catch (Exception e) {
            head.setError_code("0001");
            head.setError_message(ConstantUtil.successMap.get("0001"));
            e.printStackTrace();
            responseInfo.setHead(head);
            System.err.println(responseInfo);
        } finally {
            //请求记录到日志表
            xencoRequestLogService.logRequest(requestJson, info, requestDate, responseInfo, new Date());
        }
        return JSONObject.toJSONString(responseInfo);
    }

    //注册方法
    @RequestMapping(value = "/sign")
    public String  getdetail(){
        System.err.println("aaaaa");
        return "echarts/syd/sign";
    }

    //返回注册后的培训证好
    @RequestMapping(value = "/tru")
    public String  tru(){
        System.err.println("bbbb");
        //培训证号
        return "echarts/syd/sign";
    }
}
