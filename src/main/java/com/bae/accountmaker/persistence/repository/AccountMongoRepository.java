package com.bae.accountmaker.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.accountmaker.persistence.domain.AccountToQueue;

@Repository
public interface AccountMongoRepository extends MongoRepository<AccountToQueue, Long> {

}
