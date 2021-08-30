package com.springboot.springdemoproject;

import com.springboot.springdemoproject.user.users;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<users, String>{
    
}
