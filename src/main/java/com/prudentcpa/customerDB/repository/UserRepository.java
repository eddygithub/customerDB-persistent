package com.prudentcpa.customerDB.repository;

import org.springframework.data.repository.CrudRepository;

import com.prudent.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
