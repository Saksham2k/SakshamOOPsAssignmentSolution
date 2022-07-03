package com.greatLearning.model;

public class TechDepartment extends SuperDepartment{

	public TechDepartment() {
		super();
	}
	
	public String departmentName() {
		return "Tech Department ";
	}
	
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String techStackInfromation() {
		return "Core Java";
	}
	
	public static void printStackInformation() {
		TechDepartment obj = new TechDepartment();
		System.out.println(obj.techStackInfromation());
	}
}
