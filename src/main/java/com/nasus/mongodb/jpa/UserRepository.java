package com.nasus.mongodb.jpa;

import com.nasus.mongodb.entity.XencoUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Royal on 2020/5/9
 */
@Repository
public interface UserRepository extends MongoRepository<XencoUser, String> {
    @Query(value = "{" + " trainnumber:{$regex:?0}\n" + "}")
    List<XencoUser> findXencoUserByTrainnumber(String trainnumber);

    @Query(value = "{" + " phonenumber:{$regex:?0}\n" + "}")
    List<XencoUser> findXencoUserByPhonenumber(String phonenumber);
}
