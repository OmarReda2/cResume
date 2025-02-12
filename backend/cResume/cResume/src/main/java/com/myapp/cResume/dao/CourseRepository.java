package com.myapp.cResume.dao;

import com.myapp.cResume.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
