package com.myapp.cResume.service;

import com.myapp.cResume.dao.EducationRepository;
import com.myapp.cResume.entity.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService {

    private EducationRepository educationRepository;

    @Autowired
    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public int updateEducation(Education edu, Long eduId, Long userId){
        return educationRepository.updateEducation(edu, eduId, userId);
    }
}
