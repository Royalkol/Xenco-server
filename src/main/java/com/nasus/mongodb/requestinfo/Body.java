package com.nasus.mongodb.requestinfo;

import lombok.Data;

/**
 * Created by Royal on 2020/5/15
 */
@Data
public class Body {
    private RequestLoginInfo logininfo;
    private RequestPhoneInfo phoneinfo;
    private RequestDistributionInfo distributioninfo;


}

