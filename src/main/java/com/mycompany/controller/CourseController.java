/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.entity.CourseEntity;
import com.mycompany.object.CourseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycompany.service.*;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author macbookpro
 */


@Controller
@RequestMapping("/admin/course")
public class CourseController {
    
    @Autowired
    CourseService courseService;
    
    @Autowired 
    GradeService gradeService;
    
    
    @GetMapping("/list")
    public String listCourse(Model model){
        
        model.addAttribute("listGrade", gradeService.getAll());
        model.addAttribute("course",new CourseInfo());
        model.addAttribute("listCourse", courseService.getAll());
        return "manageCourse";
    }
    
    
    @PostMapping("/add")
    public String addCourse(@ModelAttribute("course") CourseInfo courseInfo){
        
        System.out.println("Grade ID" + courseInfo.getGradeId() );
        CourseEntity courseNew = new CourseEntity(courseInfo.getCourseName(), courseInfo.getMajor() , gradeService.getGradeById(courseInfo.getGradeId()));
        
        courseService.saveCourse(courseNew);
        return "redirect:/admin/course/list";
    }
        
}
