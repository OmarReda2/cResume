package com.myapp.cResume.controller;

import com.myapp.cResume.entity.Education;
import com.myapp.cResume.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/educations")
@CrossOrigin("http://localhost:4200")
public class EducationController {


    private EducationService educationService;

    @Autowired
    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @PutMapping("/updateEducation")
    public int updateEducation(@RequestBody Education edu,
                               @RequestParam Long eduId,
                               @RequestParam Long userId){
        return educationService.updateEducation(edu, eduId, userId);
    }
}
