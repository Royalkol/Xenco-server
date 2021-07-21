package com.nasus.mongodb.responseinfo;

import lombok.Data;

/**
 * Created by Royal on 2020/5/15
 */
@Data
public class ResponseInfo {
    private ResponseHead head;
    private Object body;

}
