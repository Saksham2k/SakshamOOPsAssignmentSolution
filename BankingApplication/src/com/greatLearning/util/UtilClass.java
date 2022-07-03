package com.greatLearning.util;

import com.greatLearning.model.SuperDepartment;

public class UtilClass {
	public static void printDepartment(SuperDepartment obj) {
		System.out.println("Welcome to "+obj.departmentName());
	}
	
	public static void printWork(SuperDepartment obj) {
		System.out.println(obj.getTodaysWork());
	}
	
	public static void printDeadline(SuperDepartment obj) {
		System.out.println(obj.getWorkDeadline());
	}
	
	public static void printHoliday(SuperDepartment obj) {
		System.out.println(obj.isTodayAHoliday());
	}
	
}
