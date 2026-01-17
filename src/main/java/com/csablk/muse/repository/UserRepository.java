package com.csablk.muse.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.csablk.muse.document.User;

public interface UserRepository extends MongoRepository<User, String>{
   Optional<User> findByEmail(String email);

   Boolean existsByEmail(String email);
}
