/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

/**
 *
 * @author macbookpro
 */


import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Exam")
public class ExamEntity  implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")        
    private int id;
    
    @Column(name = "createDate", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    
    
    @Column(name="detail")
    private String detail;
    
    @Column(name="name")
    private String name;
    
    @Column(name="type")
    private String type;
    
    @Column(name="scheduledTime")
    private int scheduledTime;
    
    
   // relation with student exam score
    
    @OneToMany(mappedBy = "exam" , fetch = FetchType.LAZY)
    private List<StudentExamScoreEntity> listStudentExamScoreEntity;
    
   // relation with student exam question
    
    @OneToMany(mappedBy = "exam" , fetch = FetchType.LAZY)
    private List<ExamQuestionEntity> listExamQuestionEntity;

    public ExamEntity(int id, Date createDate, String detail, String name, String type, int scheduledTime, List<StudentExamScoreEntity> listStudentExamScoreEntity, List<ExamQuestionEntity> listExamQuestionEntity) {
        this.id = id;
        this.createDate = createDate;
        this.detail = detail;
        this.name = name;
        this.type = type;
        this.scheduledTime = scheduledTime;
        this.listStudentExamScoreEntity = listStudentExamScoreEntity;
        this.listExamQuestionEntity = listExamQuestionEntity;
    }

    public ExamEntity() {
    }

    public List<StudentExamScoreEntity> getListStudentExamScoreEntity() {
        return listStudentExamScoreEntity;
    }

    public void setListStudentExamScoreEntity(List<StudentExamScoreEntity> listStudentExamScoreEntity) {
        this.listStudentExamScoreEntity = listStudentExamScoreEntity;
    }

    public List<ExamQuestionEntity> getListExamQuestionEntity() {
        return listExamQuestionEntity;
    }

    public void setListExamQuestionEntity(List<ExamQuestionEntity> listExamQuestionEntity) {
        this.listExamQuestionEntity = listExamQuestionEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(int scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
    
    
    
    
   
    
    
    
    
        
    
    
}
