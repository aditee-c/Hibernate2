package com.zensar.entities;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Aditee Chourasiy
 * @CREATION-Date 27-09-2019 11.49AM
 * @modification-date 27-09-2019 2.15PM
 * @version 3.0
 * @copyRight All Rights reserved by Zensar Technologies
 * @description It is a WageEmp Class
 *
 */
@Entity
@Table(name = "WageEmp_2")
public class WageEmp extends Employee {
	private int hours;
	private float rate;
	public WageEmp() {
		// TODO Auto-generated constructor stub
	}
	public WageEmp(int emId, String name, LocalDate joinDate, double salary, int hours, float rate) {
		super(emId, name, joinDate, salary);
		this.hours = hours;
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}
	
	
}
