/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mycompany.repository.*;
import com.mycompany.entity.*;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author macbookpro
 */
@Service
public class GradeService {
    
    
    @Autowired
    GradeRepo gradeRepo;
    
    
    public List<GradeEntity> getAll(){
    
        return (List<GradeEntity>) gradeRepo.findAll();
    }
    
    public GradeEntity getGradeById(int id){
        
        Optional<GradeEntity> Opt = gradeRepo.findById(id);
        return Opt.isPresent() ? Opt.get() : null;
    }
}
