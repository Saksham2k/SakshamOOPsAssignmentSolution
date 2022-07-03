package com.greatLearning.driver;

import com.greatLearning.model.AdminDepartment;
import com.greatLearning.model.HrDepartment;
import com.greatLearning.model.SuperDepartment;
import com.greatLearning.model.TechDepartment;
import com.greatLearning.util.UtilClass;

public class DriverClass {
	public static void main(String[] args) {
		SuperDepartment objAdmin = new AdminDepartment();
		SuperDepartment objHr = new HrDepartment();
		SuperDepartment objTech = new TechDepartment();
		
		UtilClass.printDepartment(objAdmin);
		UtilClass.printWork(objAdmin);
		UtilClass.printDeadline(objAdmin);
		UtilClass.printHoliday(objAdmin);
		
		System.out.println();
		System.out.println();
		
		UtilClass.printDepartment(objHr);
		HrDepartment.printActivity();
		UtilClass.printWork(objHr);
		UtilClass.printDeadline(objHr);
		UtilClass.printHoliday(objHr);
		
		System.out.println();
		System.out.println();
		
		UtilClass.printDepartment(objTech);
		UtilClass.printWork(objTech);
		UtilClass.printDeadline(objTech);
		TechDepartment.printStackInformation();
		UtilClass.printHoliday(objTech);
	}
}
