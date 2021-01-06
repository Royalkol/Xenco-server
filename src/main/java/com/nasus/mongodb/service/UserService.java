package com.nasus.mongodb.service;


import com.nasus.mongodb.entity.XencoUser;
import com.nasus.mongodb.requestinfo.RequestLoginInfo;
import com.nasus.mongodb.requestinfo.RequestPhoneInfo;
import com.nasus.mongodb.responseinfo.ResponseLoginBody;
import com.nasus.mongodb.responseinfo.ResponsePhoneBody;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Royal on 2020/5/9
 */
public interface UserService {

    ResponseLoginBody login(RequestLoginInfo requestLoginInfo);

    ResponsePhoneBody checkPhonNumber(RequestPhoneInfo requestPhoneInfo);

    XencoUser addUser(@RequestBody XencoUser xencoUser);

    XencoUser findUserByTrainnumber(String trainnumber);

    XencoUser findUserByPhonenumber(String phonenumber);
//
//    List<XencoUser> findAllUser();
//
//    void deleteUser(String id);
//
//    XencoUser updateUser(XencoUser xencoUser);
//
}
