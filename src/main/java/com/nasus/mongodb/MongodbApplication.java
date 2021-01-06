package com.nasus.mongodb;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbApplication {
    private static final Log logger = LogFactory.getLog(SpringApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(MongodbApplication.class, args);
    }
}
