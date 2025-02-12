package com.myapp.cResume.dao;

import com.myapp.cResume.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
public interface LinkRepository extends JpaRepository<Link, Long> {

    // access this function => http://localhost:8080/links/search/findByUserId?userId=1
    List<Link> findByUserId(@Param("userId") Long userId);
}
