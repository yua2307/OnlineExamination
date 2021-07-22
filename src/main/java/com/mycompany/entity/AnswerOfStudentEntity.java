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
@Table(name="AnswerOfStudent")
public class AnswerOfStudentEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")        
    private int id;
    
    @Column(name="answer")
    private String answer ; 
    
    
    @Column(name = "answerDate", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date answerDate;
    
    

    
    //relation with Table student
    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;
    
    //relation with Table exam question 
    @ManyToOne
    @JoinColumn(name = "exam_question_id")
    private ExamQuestionEntity examQuestion;

    public AnswerOfStudentEntity(int id, String answer, Date answerDate, StudentEntity student, ExamQuestionEntity examQuestion) {
        this.id = id;
        this.answer = answer;
        this.answerDate = answerDate;
        this.student = student;
        this.examQuestion = examQuestion;
    }

    

    public AnswerOfStudentEntity() {
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public ExamQuestionEntity getExamQuestion() {
        return examQuestion;
    }

    public void setExamQuestion(ExamQuestionEntity examQuestion) {
        this.examQuestion = examQuestion;
    }

    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }

    
    
    
}
