package com.greatLearning.model;

import com.greatLearning.services.IBankingServices;

public class SuperDepartment implements IBankingServices{
	
	public SuperDepartment() {	
	}

	public String departmentName() {
		return "SuperDepartment";
	}
	
	public String getTodaysWork() {
		return "No work as of now";
	}
	
	public String getWorkDeadline() {
		return "NIL";
	}
	
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}
