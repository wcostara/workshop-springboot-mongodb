package com.workshop.projectmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshop.projectmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
