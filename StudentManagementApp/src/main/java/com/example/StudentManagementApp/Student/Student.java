package com.example.StudentManagementApp.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String studentName;
    private String address;
    private String phoneNumber;

    // --- 1. Empty Constructor (Required by Spring/JPA) ---
    public Student() {
    }

    // --- 2. Constructor with fields ---
    public Student(String studentName, String address, String phoneNumber) {
        this.studentName = studentName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // --- 3. Getters and Setters (Required so Spring can read/write data) ---
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}