package com.nasus.mongodb.service.impl;

import com.nasus.mongodb.entity.XencoUser;
import com.nasus.mongodb.jpa.UserRepository;
import com.nasus.mongodb.requestinfo.RequestLoginInfo;
import com.nasus.mongodb.requestinfo.RequestPhoneInfo;
import com.nasus.mongodb.responseinfo.ResponseLoginBody;
import com.nasus.mongodb.responseinfo.ResponsePhoneBody;
import com.nasus.mongodb.service.UserService;
import com.nasus.mongodb.vo.LoginInfoVo;
import com.nasus.mongodb.vo.PhoneInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Royal on 2020/5/9
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public ResponseLoginBody login(RequestLoginInfo requestLoginInfo) {
        String backMessage = "登录成功";
        String backStatus = "0000";
        LoginInfoVo loginInfoVo = new LoginInfoVo();
        ResponseLoginBody responseLoginBody = new ResponseLoginBody();
        XencoUser xencoUser = this.findUserByTrainnumber(requestLoginInfo.getTrainnumber());
        System.err.println(xencoUser);
        //账号不存在的情况
        if (xencoUser==null){
            backMessage = "登录失败";
            backStatus = "0001";
        }else {
            //账号存在密码不匹配的情况
            if (!requestLoginInfo.getPassword().equals(xencoUser.getPassword())) {
                backMessage = "登录失败";
                backStatus = "0001";
            }
        }
        loginInfoVo.setBackMessage(backMessage);
        loginInfoVo.setBackStatus(backStatus);
        responseLoginBody.setResultinfo(loginInfoVo);
        return responseLoginBody;
    }

    @Override
    public ResponsePhoneBody checkPhonNumber(RequestPhoneInfo requestPhoneInfo) {
        String backMessage = "该手机号下有绑定培训证号";
        String backStatus = "0000";
        String trainnumber="";
        PhoneInfoVo phoneInfoVo = new PhoneInfoVo();
        ResponsePhoneBody responsePhoneBody = new ResponsePhoneBody();
        XencoUser xencoUser = this.findUserByPhonenumber(requestPhoneInfo.getPhonenumber());
        System.err.println(xencoUser);
        if (xencoUser==null) {
            backMessage = "该手机号下未绑定培训证号";
            backStatus = "0001";
        }else {
            trainnumber =xencoUser.getTrainnumber();
        }
        phoneInfoVo.setTrainnumber(trainnumber);
        phoneInfoVo.setBackmessage(backMessage);
        phoneInfoVo.setBackStatus(backStatus);
        responsePhoneBody.setTraininfo(phoneInfoVo);
        return responsePhoneBody;
    }


    @Override
    public XencoUser findUserByTrainnumber(String trainnumber) {
        XencoUser xencoUser = null;
        List<XencoUser> xencoUserList = userRepository.findXencoUserByTrainnumber(trainnumber);
        if (xencoUserList!=null&&xencoUserList.size() > 0) {
            xencoUser = xencoUserList.get(0);
        }
        return xencoUser;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public XencoUser findUserByPhonenumber(String phonenumber) {
        XencoUser xencoUser = new XencoUser();
        List<XencoUser> xencoUserList = userRepository.findXencoUserByPhonenumber(phonenumber);
        if (xencoUserList!=null&&xencoUserList.size() > 0) {
            xencoUser = xencoUserList.get(0);
        }
        return xencoUser;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public XencoUser addUser(XencoUser xencoUser) {
        return userRepository.save(xencoUser);
    }
}
