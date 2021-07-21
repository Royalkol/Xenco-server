package com.nasus.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Royal on 2020/11/20
 */
@Data
public class XencoEuipmentHis {
    @Id
    private String id;
    /**
     * 设备编号(唯一标识)
     */
    private String euipmentserialnumber;
    /**
     * 设备名称
     */
    private String age;
    /**
     * 生产日期
     */
    private Date productiondate;
    /**
     * 气瓶编号
     */
    private String gasserialnumber;
    /**
     * 气体总量
     */
    private String totalgas;
    /**
     * 气体余量
     */
    private String allowancegas;
    /**
     * 创建时间
     */
    private Date createdate;

}
