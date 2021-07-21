package com.nasus.mongodb.responseinfo;

import lombok.Data;

/**
 * Created by Royal on 2020/5/15
 */
@Data
public class ResponseHead {
    private String sys_code;
    private String request_type;
    private String error_code;
    private String error_message;


}
