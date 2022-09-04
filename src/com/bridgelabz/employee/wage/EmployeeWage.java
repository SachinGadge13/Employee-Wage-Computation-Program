package com.bridgelabz.employee.wage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;
		int workingDayPerMonth = 20;
		int monthlySalary = 0;
		
		for (int i = 1; i <= workingDayPerMonth; i++) {
			Random random = new Random();
			int randomNum = random.nextInt(3); // 0-1-2

			switch (randomNum) {
			case 0:
				System.out.println("Employee is absent");
				break;
			case 1:
				System.out.println("Employee is present");
				salary = wagePerHour * fullDayHours;

				break;
			case 2:
				System.out.println("Employee worked for half day");
				salary = wagePerHour * halfDayHours;
				break;
			}
			monthlySalary = monthlySalary + salary;
		}
		System.out.println("Employee Monthly salary is : " + monthlySalary);

	}

}
