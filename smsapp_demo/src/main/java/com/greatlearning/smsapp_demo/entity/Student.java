package com.greatlearning.smsapp_demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	// define fields

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "department")
	private String department;

	@Column(name = "country")
	private String country;

	public Student() {

	}

	public Student(String firstName, String department, String country) {

		this.firstName = firstName;

		this.department = department;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getdepartment() {
		return department;
	}

	public void setdepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", department=" + department + ", country=" + country + "]";
	}
}
