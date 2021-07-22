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

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name="Course")
public class CourseEntity  implements Serializable  {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")        
    private int id;
    
    @Column(name = "courseName")
    private String courseName;
    
    
    @Column(name = "major")
    private String major;
    
    // relationship with Grade
    @ManyToOne
    @JoinColumn(name = "grade_id")
    private GradeEntity grade;

   // relationship with Exam
    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private List<ExamEntity> listExamEntity;

    public CourseEntity() {
    }

    public CourseEntity(int id, String courseName, String major, GradeEntity grade, List<ExamEntity> listExamEntity) {
        this.id = id;
        this.courseName = courseName;
        this.major = major;
        this.grade = grade;
        this.listExamEntity = listExamEntity;
    }

    public CourseEntity(String courseName, String major, GradeEntity grade) {
        this.courseName = courseName;
        this.major = major;
        this.grade = grade;

    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public GradeEntity getGrade() {
        return grade;
    }

    public void setGrade(GradeEntity grade) {
        this.grade = grade;
    }

    public List<ExamEntity> getListExamEntity() {
        return listExamEntity;
    }

    public void setListExamEntity(List<ExamEntity> listExamEntity) {
        this.listExamEntity = listExamEntity;
    }


            
}
