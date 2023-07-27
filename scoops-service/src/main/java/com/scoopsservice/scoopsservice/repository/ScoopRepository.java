package com.searchscoops.searchscoopsservice.repository;

import com.searchscoops.searchscoopsservice.model.Scoop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScoopRepository extends MongoRepository<Scoop, String> {
}
