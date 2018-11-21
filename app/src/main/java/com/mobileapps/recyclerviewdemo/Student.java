package com.mobileapps.recyclerviewdemo;

public class Student {
    String studentName;
    String studentGrade;

    public Student(String studentName, String studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

}
