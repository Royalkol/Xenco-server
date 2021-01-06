package com.nasus.mongodb.responseinfo;

/**
 * Created by Royal on 2020/5/15
 */
public class ResponseInfo {
    private ResponseHead head;
    private Object body;

    public ResponseHead getHead() {
        return head;
    }

    public void setHead(ResponseHead head) {
        this.head = head;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
