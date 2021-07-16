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
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name="Student")
public class StudentEntity implements Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")        
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name="username")
     private String username;
    
     @Column(name="password")
     private String password;
     
     
    @Column(name = "avatarPath")
    private String avatarPath;
    
    
    @Column(name = "avatarFilePath")
    private String avatarFilePath;
    
    
    @Column(name = "enabled")
    private Boolean enabled;
    
    // relationship with grade
    @ManyToOne
    @JoinColumn(name = "grade_id")
    private GradeEntity grade;
    
    
    // relationship with table UserRole
    
    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
    private List<UserRoleEntity> listUserRole; 
    
    
    // relation with StudentExamScoreEntity
      
    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
    private List<StudentExamScoreEntity> listStudentExamScoreEntity;
    
    // relation with AnswerOfStudentEntity
    
    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
    private List<AnswerOfStudentEntity> listAnswerOfStudentEntity;

    public StudentEntity(int id, String name, String username, String password, String avatarPath, String avatarFilePath, Boolean enabled, GradeEntity gradeEntity, List<UserRoleEntity> listUserRole, List<StudentExamScoreEntity> listStudentExamScoreEntity, List<AnswerOfStudentEntity> listAnswerOfStudentEntity) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.avatarPath = avatarPath;
        this.avatarFilePath = avatarFilePath;
        this.enabled = enabled;
        this.grade = gradeEntity;
        this.listUserRole = listUserRole;
        this.listStudentExamScoreEntity = listStudentExamScoreEntity;
        this.listAnswerOfStudentEntity = listAnswerOfStudentEntity;
    }

    
    public StudentEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getAvatarFilePath() {
        return avatarFilePath;
    }

    public void setAvatarFilePath(String avatarFilePath) {
        this.avatarFilePath = avatarFilePath;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    

    public List<UserRoleEntity> getListUserRole() {
        return listUserRole;
    }

    public void setListUserRole(List<UserRoleEntity> listUserRole) {
        this.listUserRole = listUserRole;
    }

    public List<StudentExamScoreEntity> getListStudentExamScoreEntity() {
        return listStudentExamScoreEntity;
    }

    public void setListStudentExamScoreEntity(List<StudentExamScoreEntity> listStudentExamScoreEntity) {
        this.listStudentExamScoreEntity = listStudentExamScoreEntity;
    }

    public List<AnswerOfStudentEntity> getListAnswerOfStudentEntity() {
        return listAnswerOfStudentEntity;
    }

    public void setListAnswerOfStudentEntity(List<AnswerOfStudentEntity> listAnswerOfStudentEntity) {
        this.listAnswerOfStudentEntity = listAnswerOfStudentEntity;
    }

    public GradeEntity getGradeEntity() {
        return grade;
    }

    public void setGradeEntity(GradeEntity gradeEntity) {
        this.grade = gradeEntity;
    }
    

}
