package com.nasus.mongodb.util;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @USER: Royal
 * @DATE: 2021/7/6
 */
@Document
@Data
public class Incr {
    @Id
    private String id;
    private String collectionName;
    private Long incrId;
}