package com.nasus.mongodb.jpa;

import com.nasus.mongodb.entity.XencoDistribution;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @USER: Royal
 * @DATE: 2021/7/5
 */
@Repository
public interface DistributionRepository extends MongoRepository<XencoDistribution, String> {

    @Query(value = "{" + " age:{$regex:?0},\n"  +
                   " lungCapacity:{$regex:?1}\n" + "}")
    XencoDistribution findDistinctByAgeAndLungCapacity(String age, String lungCapacity);

}
