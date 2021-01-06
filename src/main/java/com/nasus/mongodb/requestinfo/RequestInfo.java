package com.nasus.mongodb.requestinfo;

/**
 * Created by Royal on 2020/5/15
 */
public class RequestInfo {
    private Head head;
    private Body body;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
