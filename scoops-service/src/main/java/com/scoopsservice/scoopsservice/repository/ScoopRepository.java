package com.scoopsservice.scoopsservice.repository;

import com.scoopsservice.scoopsservice.model.Scoop;
import com.scoopsservice.scoopsservice.model.Scoop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScoopRepository extends MongoRepository<Scoop, String> {
}
