package com.nasus.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Royal on 2020/5/15
 */
@Data
public class XencoAppInfo {

    @Id
    private String id;

    @NotNull
    private String syscode;

    private String sysname;

    private String appkey;

    private String validstatus;

    private String servicetype;

    private Date createdate;

    private String createcode;

    private Date startdate;

    private Date enddate;

    private String remark;

    private String attr1;

    private String attr2;
}
