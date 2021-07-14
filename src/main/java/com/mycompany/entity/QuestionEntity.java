/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name="Question")
public class QuestionEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")        
    private int id;
    
    @Column(name="content")        
    private String content;
    
    @Column(name="answer")        
    private String answer;
    
      
    @Column(name = "createDate", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    
    
    @Column(name = "description")
    private String description;
    
    @Column(name="choiceA")        
    private String choiceA;
    
    @Column(name="choiceB")        
    private int choiceB;
    
    @Column(name="choiceC")        
    private int choiceC;
    
    @Column(name="choiceD")        
    private int choiceD;
    
    
    // relation with table ExamQuestion

    @OneToMany(mappedBy = "question",fetch = FetchType.LAZY)
    private List<ExamQuestionEntity> listExamQuestionEntity;

    public QuestionEntity(int id, String content, String answer, Date createDate, String description, String choiceA, int choiceB, int choiceC, int choiceD, List<ExamQuestionEntity> listExamQuestionEntity) {
        this.id = id;
        this.content = content;
        this.answer = answer;
        this.createDate = createDate;
        this.description = description;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
        this.listExamQuestionEntity = listExamQuestionEntity;
    }

    public QuestionEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA;
    }

    public int getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(int choiceB) {
        this.choiceB = choiceB;
    }

    public int getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(int choiceC) {
        this.choiceC = choiceC;
    }

    public int getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(int choiceD) {
        this.choiceD = choiceD;
    }

    public List<ExamQuestionEntity> getListExamQuestionEntity() {
        return listExamQuestionEntity;
    }

    public void setListExamQuestionEntity(List<ExamQuestionEntity> listExamQuestionEntity) {
        this.listExamQuestionEntity = listExamQuestionEntity;
    }
    
    
    
    
  
    
    
}
