/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.object;

/**
 *
 * @author macbookpro
 */
public class CourseInfo {
    
    private String courseName;
    private String major; 
    private int gradeId;

    public CourseInfo(String courseName, String major, int gradeId) {
        this.courseName = courseName;
        this.major = major;
        this.gradeId = gradeId;
    }

    public CourseInfo() {
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

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }
    
    
    
}
