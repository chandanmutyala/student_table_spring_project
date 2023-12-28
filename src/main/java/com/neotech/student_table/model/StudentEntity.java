package com.neotech.student_table.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity( name="student_table")
public class StudentEntity {
    @Id
    private int sNo;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String eMail;
    @Column(name = "mobileNo")
    private String mobileNo;

    public StudentEntity(){

    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
