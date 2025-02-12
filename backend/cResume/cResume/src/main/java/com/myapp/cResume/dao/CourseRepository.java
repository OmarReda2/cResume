package com.myapp.cResume.dao;

import com.myapp.cResume.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Pageable;
import java.util.List;

@CrossOrigin("http://localhost:4200")
public interface CourseRepository extends JpaRepository<Course, Long> {

    // access this function => http://localhost:8080/courses/search/findByUserId?userId=1
    List<Course> findByUserId(@Param("userId") Long userId);
}
