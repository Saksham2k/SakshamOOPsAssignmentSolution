package com.greatLearning.model;

public class HrDepartment extends SuperDepartment {

	public HrDepartment() {
		super();
	}
	
	public String departmentName() {
		return "HR Department";
	}
	
	public String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team lunch";
	}
	
	public static void printActivity() {
		HrDepartment obj = new HrDepartment();
		System.out.println(obj.doActivity());
	}
	
}
