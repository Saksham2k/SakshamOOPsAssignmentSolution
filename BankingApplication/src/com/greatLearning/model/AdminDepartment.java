package com.greatLearning.model;


public class AdminDepartment extends SuperDepartment{

	public AdminDepartment() {
		super();
	}
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your Document submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
