package com.ravi.springboot.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "dept_code")
    private String code;

    @Column(name = "dept_name")
    private String name;

    @Column(name = "dept_hod")
    private String hod;

    @Column(name = "dept_email")
    private String email;

    public Department() {

    }

    public Department(String code, String name, String hod, String email) {
        this.code = code;
        this.name = name;
        this.hod = hod;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHod() {
        return hod;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Department{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", hod='" + hod + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
