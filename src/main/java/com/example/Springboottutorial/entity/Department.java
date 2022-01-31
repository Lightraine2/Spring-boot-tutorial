package com.example.Springboottutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String deparmentName;
    private String deparmentAddress;
    private String deparmentCode;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }

    public String getDeparmentAddress() {
        return deparmentAddress;
    }

    public void setDeparmentAddress(String deparmentAddress) {
        this.deparmentAddress = deparmentAddress;
    }

    public String getDeparmentCode() {
        return deparmentCode;
    }

    public void setDeparmentCode(String deparmentCode) {
        this.deparmentCode = deparmentCode;
    }

    public Department(Long departmentId, String deparmentName, String deparmentAddress, String deparmentCode) {
        this.departmentId = departmentId;
        this.deparmentName = deparmentName;
        this.deparmentAddress = deparmentAddress;
        this.deparmentCode = deparmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", deparmentName='" + deparmentName + '\'' +
                ", deparmentAddress='" + deparmentAddress + '\'' +
                ", deparmentCode='" + deparmentCode + '\'' +
                '}';
    }
}
