package com.nasus.mongodb.service;

import com.nasus.mongodb.entity.XencoTeartment;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Royal on 2020/11/23
 */
public interface TreatmentService {
    //新增治疗数据
    XencoTeartment addTeartment(@RequestBody XencoTeartment xencoTeartment);

//    通过手机号码查询治疗数据
//    XencoTeartment findTeartmentByPhone(@RequestBody  XencoTeartment xencoTeartment);

    //删除患者数据
//    XencoTeartment deletePatient(@RequestBody XencoTeartment xencoTeartment);

}
