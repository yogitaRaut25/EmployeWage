package com.employeewage.practice;

public class Uc1_EmployeeAttendenceUsingSwitch {
	public static final int IS_PRESENT = 1;
	public static final int IS_ABSENT = 0;

	public static void main(String[] args) {
		int workHrs;
		int empCheck=(int)(Math.random()*10)%2;

		switch(empCheck) {
		case IS_PRESENT : workHrs=8;
		System.out.println("Employee is present & working hours = "+workHrs);
		break;

		case IS_ABSENT : workHrs=0;
		System.out.println("Employee is absent & working hours = "+workHrs);
		break;

		default:System.out.println("Invalid Input");
		}
	}

}
