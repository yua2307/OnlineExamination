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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import jdk.javadoc.internal.doclets.toolkit.SerializedFormWriter;

/**
 *
 * @author macbookpro
 */


@Entity
@Table(name="Grade")
public class GradeEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")        
    private int id;
    
    @Column(name = "schoolYear")
    private int schoolYear;
    
    // relation with course 
    @OneToMany(mappedBy = "grade" ,fetch = FetchType.LAZY)
    private List<CourseEntity> listCourseEntity;
    
     // relation with student 
    @OneToMany(mappedBy = "grade" ,fetch = FetchType.LAZY)
    private List<StudentEntity> listStudentEntity;

    public GradeEntity(int id, int schoolYear, List<CourseEntity> listCourseEntity, List<StudentEntity> listStudentEntity) {
        this.id = id;
        this.schoolYear = schoolYear;
        this.listCourseEntity = listCourseEntity;
        this.listStudentEntity = listStudentEntity;
    }

    public GradeEntity() {
    }

    public List<CourseEntity> getListCourseEntity() {
        return listCourseEntity;
    }

    public void setListCourseEntity(List<CourseEntity> listCourseEntity) {
        this.listCourseEntity = listCourseEntity;
    }

    public List<StudentEntity> getListStudentEntity() {
        return listStudentEntity;
    }

    public void setListStudentEntity(List<StudentEntity> listStudentEntity) {
        this.listStudentEntity = listStudentEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;

    }
}           
