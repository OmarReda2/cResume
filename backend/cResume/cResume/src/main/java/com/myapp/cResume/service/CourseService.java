package com.myapp.cResume.service;

import com.myapp.cResume.dao.CourseRepository;
import com.myapp.cResume.entity.Course;
import com.myapp.cResume.entity.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public int updateCourse(Course course, Long courseId, Long userId){
        return courseRepository.updateCourse(course, courseId, userId);
    }
}
