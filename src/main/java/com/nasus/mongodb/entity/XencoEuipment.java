package com.nasus.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Royal on 2020/11/20
 */
@Data
public class XencoEuipment {
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
    /**
     * 更新时间
     */
    private Date updatedate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEuipmentserialnumber() {
        return euipmentserialnumber;
    }

    public void setEuipmentserialnumber(String euipmentserialnumber) {
        this.euipmentserialnumber = euipmentserialnumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getProductiondate() {
        return productiondate;
    }

    public void setProductiondate(Date productiondate) {
        this.productiondate = productiondate;
    }

    public String getGasserialnumber() {
        return gasserialnumber;
    }

    public void setGasserialnumber(String gasserialnumber) {
        this.gasserialnumber = gasserialnumber;
    }

    public String getTotalgas() {
        return totalgas;
    }

    public void setTotalgas(String totalgas) {
        this.totalgas = totalgas;
    }

    public String getAllowancegas() {
        return allowancegas;
    }

    public void setAllowancegas(String allowancegas) {
        this.allowancegas = allowancegas;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}
