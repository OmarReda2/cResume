package com.myapp.cResume.controller;


import com.myapp.cResume.entity.Course;
import com.myapp.cResume.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
@CrossOrigin("http://localhost:4200")
public class CourseController {

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @PutMapping("/updateCourse/{userId}/{courseId}")
    public int updateCourse(@RequestBody Course course, @PathVariable Long userId, @PathVariable Long courseId){
        return courseService.updateCourse(course, courseId, userId);
    }
}
