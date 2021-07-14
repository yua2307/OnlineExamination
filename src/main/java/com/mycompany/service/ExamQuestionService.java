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
/**
 *
 * @author macbookpro
 */
@Service
public class ExamQuestionService {
    
      
    @Autowired
    ExamQuestionRepo examQuestionRepo;
    
    
}
