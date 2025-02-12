package com.myapp.cResume.dao;

import com.myapp.cResume.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
