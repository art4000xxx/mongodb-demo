package com.example.mongodbdemo.repository;

import com.example.mongodbdemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByNameContainingIgnoreCase(String name);
    List<User> findByAgeGreaterThanEqual(int age);
}