package com.myapp.cResume.dao;

import com.myapp.cResume.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
