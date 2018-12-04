package com.qa.ConsumeApi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.BabyApi.domain.POJOName;

@Repository
public interface POJONameRepository extends MongoRepository<POJOName,String> {

}
