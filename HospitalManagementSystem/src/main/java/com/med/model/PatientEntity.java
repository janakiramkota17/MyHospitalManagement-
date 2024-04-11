package com.med.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class PatientEntity {
    private int visitingId;
    @Id
    private int patientId;
    private String patientName;
    private int age;
    private String gender;
    private long mobile;
//    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate regDateTime;
public PatientEntity() {
	super();
}
public PatientEntity(int visitingId, int patientId, String patientName, int age, String gender, long mobile,
		LocalDate regDateTime) {
	super();
	this.visitingId = visitingId;
	this.patientId = patientId;
	this.patientName = patientName;
	this.age = age;
	this.gender = gender;
	this.mobile = mobile;
	this.regDateTime = regDateTime;
}
public int getVisitingId() {
	return visitingId;
}
public void setVisitingId(int visitingId) {
	this.visitingId = visitingId;
}
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public LocalDate getRegDateTime() {
	return regDateTime;
}
public void setRegDateTime(LocalDate regDateTime) {
	this.regDateTime = regDateTime;
}
@Override
public String toString() {
	return "PatientEntity [visitingId=" + visitingId + ", patientId=" + patientId + ", patientName=" + patientName
			+ ", age=" + age + ", gender=" + gender + ", mobile=" + mobile + ", regDateTime=" + regDateTime + "]";
}

    
}
