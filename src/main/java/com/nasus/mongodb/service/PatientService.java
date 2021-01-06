package com.nasus.mongodb.service;

import com.nasus.mongodb.entity.XencoPatient;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Royal on 2020/11/23
 */
public interface PatientService {
    //新增患者数据数据 正表和历史表都添加
    XencoPatient addPatient(@RequestBody XencoPatient xencoPatient);

    //更新患者数据
    XencoPatient updatePatient(@RequestBody XencoPatient xencoPatient);

//    //通过手机号码查询患者数据
//    XencoPatient findPatientByPhone(@RequestBody XencoPatient xencoPatient);

    //删除患者数据
//    XencoPatient deletePatient(@RequestBody XencoPatient xencoPatient);
}
