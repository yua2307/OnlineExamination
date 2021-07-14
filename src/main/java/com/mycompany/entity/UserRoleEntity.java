/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "user_roles", uniqueConstraints = //
@UniqueConstraint(columnNames = { "role", "username" }))
public class UserRoleEntity implements Serializable {
    
    
    @Id   
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_role_id")
    private int id;
    
    
    @ManyToOne
    @JoinColumn(name="student_id")
    private StudentEntity student;
    
    @Column(name="role")
    private String userRole;
    
    
    @Column(name = "username")
    private String userName;

    public UserRoleEntity(int id, StudentEntity student, String userRole, String userName) {
        this.id = id;
        this.student = student;
        this.userRole = userRole;
        this.userName = userName;
    }

    public UserRoleEntity() {
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    
  
    
}
