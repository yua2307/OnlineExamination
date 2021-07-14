/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name="StudentExamScore")
public class StudentExamScoreEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")        
    private int id;
    
    
    @Column(name="score")
    private int score;
    
    @Column(name="timeUsed")
    private int timeUsed;
    
    
    @Column(name = "examStartTime", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date examStartTime;
    
    
    @Column(name = "examEndTime", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date examEndTime;
    
    
    //relation with Table Student
    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;
    
    //relation with Table Exam 
    @ManyToOne
    @JoinColumn(name = "exam_id")
    private ExamEntity exam;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(int timeUsed) {
        this.timeUsed = timeUsed;
    }

    public Date getExamStartTime() {
        return examStartTime;
    }

    public void setExamStartTime(Date examStartTime) {
        this.examStartTime = examStartTime;
    }

    public Date getExamEndTime() {
        return examEndTime;
    }

    public void setExamEndTime(Date examEndTime) {
        this.examEndTime = examEndTime;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public ExamEntity getExam() {
        return exam;
    }

    public void setExam(ExamEntity exam) {
        this.exam = exam;
    }

    public StudentExamScoreEntity(int id, int score, int timeUsed, Date examStartTime, Date examEndTime, StudentEntity student, ExamEntity exam) {
        this.id = id;
        this.score = score;
        this.timeUsed = timeUsed;
        this.examStartTime = examStartTime;
        this.examEndTime = examEndTime;
        this.student = student;
        this.exam = exam;
    }

    public StudentExamScoreEntity() {
    }
    
    
    
    
    

    
}
