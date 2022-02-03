package com.employeewage.practice;

public class Uc1_EmployeeAttendence {
	public static final int IS_PRESENT = 1;

	public static void main(String[] args) {
		int workHrs;
		int empCheck=(int)(Math.random()*10)%2;

		if(empCheck == IS_PRESENT) {
			workHrs=8;
			System.out.println("Employee is present & working hours = "+workHrs);
		}
		else {
			workHrs=0;
			System.out.println("Employee is absent & working hours = "+workHrs);
		}
	}

}
