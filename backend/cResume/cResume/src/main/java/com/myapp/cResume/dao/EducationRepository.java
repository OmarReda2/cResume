package com.myapp.cResume.dao;

import com.myapp.cResume.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
public interface EducationRepository extends JpaRepository<Education, Long> {

    // access this function => http://localhost:8080/educations/search/findByUserId?userId=1
    List<Education> findByUserId(@Param("userId") Long userId);
}
