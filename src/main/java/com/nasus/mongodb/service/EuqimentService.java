package com.nasus.mongodb.service;

import com.nasus.mongodb.entity.XencoEuipment;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Royal on 2020/11/23
 */
public interface EuqimentService {
    //新增设备数据数据 正表和历史表都添加
    XencoEuipment addEuipment(@RequestBody XencoEuipment XencoEuipment);

    //更新患者数据
    XencoEuipment updateEuipment(@RequestBody XencoEuipment XencoEuipment);

//    //通过设备编号查询患者数据
//    XencoEuipment findPatientByNumber(@RequestBody XencoEuipment XencoEuipment);

    //删除患者数据
//    XencoEuipment deleteEuipment(@RequestBody XencoEuipment XencoEuipment);
}
