package com.bridgelabz.employee.wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		int wagePerHour = 20;
		int fullDayHours = 8;
		int salary = 0;

		Random random = new Random();
		int randomNum = random.nextInt(2); // 0-1

		if (randomNum == 1) {
			System.out.println("Employee is present");
			salary = wagePerHour * fullDayHours;
		} else
			System.out.println("Employee is absent");
		System.out.println("Employee salary is : " + salary);
	}

}
