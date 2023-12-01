package com.BPK.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String studentID;
	private String major;
	private Date enrollmentDate;

	// Constructors (default and parameterized)

	public Student() {
		// Default constructor
	}

	public Student(String name, String studentID, String major, Date enrollmentDate) {
		this.name = name;
		this.studentID = studentID;
		this.major = major;
		this.enrollmentDate = enrollmentDate;
	}

	// Getter and Setter methods

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	// toString method (for debugging and logging)

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", studentID='" + studentID + '\'' + ", major='"
				+ major + '\'' + ", enrollmentDate=" + enrollmentDate + '}';
	}
}
