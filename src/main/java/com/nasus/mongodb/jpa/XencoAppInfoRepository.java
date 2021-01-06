package com.nasus.mongodb.jpa;

import com.nasus.mongodb.entity.XencoAppInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Royal on 2020/5/15
 */
@Repository
public interface XencoAppInfoRepository extends MongoRepository<XencoAppInfo, String> {


}

