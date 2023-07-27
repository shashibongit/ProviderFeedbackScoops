 package com.example.scoops.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.scoops.entity.Scoop;

@Repository

public interface ScoopRepo extends MongoRepository<Scoop, String> {

}
