package com.crystal.spring_db.repository;

import com.crystal.spring_db.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
}
