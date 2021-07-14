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
@Table(name="ExamQuestion")
public class ExamQuestionEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")        
    private int id;

    
    
    // relation with exam
    @ManyToOne
    @JoinColumn(name = "exam_id")
    private ExamEntity exam;
    

    // relation with question
    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionEntity question;
    

    // relation with answerOfStudent
    @OneToMany(mappedBy = "examQuestion", fetch = FetchType.LAZY)
    private List<AnswerOfStudentEntity> listAnswerOfStudent;

    public ExamQuestionEntity(int id, ExamEntity exam, QuestionEntity question, List<AnswerOfStudentEntity> listAnswerOfStudent) {
        this.id = id;
        this.exam = exam;
        this.question = question;
        this.listAnswerOfStudent = listAnswerOfStudent;
    }

    public ExamQuestionEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ExamEntity getExam() {
        return exam;
    }

    public void setExam(ExamEntity exam) {
        this.exam = exam;
    }

    public QuestionEntity getQuestion() {
        return question;
    }

    public void setQuestion(QuestionEntity question) {
        this.question = question;
    }

    public List<AnswerOfStudentEntity> getListAnswerOfStudent() {
        return listAnswerOfStudent;
    }

    public void setListAnswerOfStudent(List<AnswerOfStudentEntity> listAnswerOfStudent) {
        this.listAnswerOfStudent = listAnswerOfStudent;
    }

   
    
    
    
    
    
    
}
