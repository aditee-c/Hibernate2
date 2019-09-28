package com.zensar.entities;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Aditee Chourasiya
 * @CREATION-Date 27-09-2019 11.31AM
 * @modification-date 27-09-2019 2.13PM
 * @version 2.0
 * @copyRight All Rights reserved by Zensar Technologies
 * @description It is a Employee Bean Class
 *
 */
@Entity
@Table(name="emp_master_1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emId;
	private String name;
	private LocalDate joinDate;
	private double Salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int emId, String name, LocalDate joinDate, double salary) {
		super();
		this.emId = emId;
		this.name = name;
		this.joinDate = joinDate;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emId=" + emId + ", name=" + name + ", joinDate=" + joinDate + ", Salary=" + Salary + "]";
	}
	public int getEmId() {
		return emId;
	}

	public void setEmId(int emId) {
		this.emId = emId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	
	
}
