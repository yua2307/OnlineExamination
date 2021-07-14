/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name="Grade")
public class GradeEntity  implements Serializable  {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")        
    private int id;
    
    @Column(name = "gradeName")
    private String gradeName;
    

    // relationship with Student
    @OneToMany(mappedBy = "grade",fetch = FetchType.LAZY)
    private List<StudentEntity> listStudentEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public List<StudentEntity> getListStudentEntity() {
        return listStudentEntity;
    }

    public void setListStudentEntity(List<StudentEntity> listStudentEntity) {
        this.listStudentEntity = listStudentEntity;
    }

    public GradeEntity(int id, String gradeName, List<StudentEntity> listStudentEntity) {
        this.id = id;
        this.gradeName = gradeName;
        this.listStudentEntity = listStudentEntity;
    }

    public GradeEntity() {
    }
    
    
    
    
    
    
    
    
    
    
            
}
