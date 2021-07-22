/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.entity.CourseEntity;
import com.mycompany.repository.CourseRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author macbookpro
 */

@Service
public class CourseService {
    
    
    @Autowired
    CourseRepo courseRepo;
    
    
    public List<CourseEntity> getAll (){
        return (List<CourseEntity>) courseRepo.findAll();
    }
    
    
    public  CourseEntity saveCourse(CourseEntity courseEntity){
        return courseRepo.save(courseEntity);
    }
    
}
