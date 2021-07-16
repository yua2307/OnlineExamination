/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.entity.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycompany.service.*;
import java.util.List;
/**
 *
 * @author macbookpro
 */


@Controller
@RequestMapping("/admin")
public class CourseController {
    
    @Autowired
    CourseService courseService;
    
    
    @GetMapping("/course")
    public String listCourse(Model model){
        
        List<CourseEntity> listCourse = courseService.getAll();
        
        System.out.println("List Size"  + listCourse.size());
        
        model.addAttribute("listCourse", listCourse);
        return "manageCourse";
    }
        
}
