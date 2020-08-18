package com.restapi.portfolio.repository;

import com.restapi.portfolio.model.Home;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends MongoRepository<Home, String> {
}
