package com.employeewage.practice;

public class Uc2_DailyEmployeeWage {
	public static final int IS_PRESENT = 1;
	public static final int WAGE_PER_HOUR = 20;


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
		System.out.println("Employee daily wage = "+(workHrs*WAGE_PER_HOUR));
	}
}
