package com.nasus.mongodb.jpa;

import com.nasus.mongodb.entity.XencoRequsetLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Royal on 2020/5/20
 */
@Repository
public interface XencoRequestLogRepository extends MongoRepository<XencoRequsetLog, String> {

}
