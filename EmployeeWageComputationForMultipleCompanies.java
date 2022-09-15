

import java.util.Random;
import java.util.Scanner;

 class Employee{
	static int fullTime = 1;
	static int partTime = 2;
	
	public static int empCheck() {
		Random rn = new Random();
		int empCheck = rn.nextInt(3);
		return empCheck;
	}
	
	public static int empWorkingHours(int empCheck) {
		int empWorkingHours;
		switch (empCheck) {
		case 1: 
		empWorkingHours = 8;
		break;
		case 2:
		empWorkingHours = 4;
		break;
		default:
			empWorkingHours = 0;
		}
		return empWorkingHours;
	}
	public static int empWage (int empWorkingHours, int wagePerHour) {
		int empWage = empWorkingHours * wagePerHour;
		return empWage;
	}
	
	public static int totalEmpSalary(int wagePerHour, int workingDays, int totalWorkingHours) {
		int day = 0;
		int totalEmpSalary = 0;
		int empWorkingHours = 0;
		int empWage = 0;
		int empCheck = 0;
		int totalEmpWorkingHours = 0;
		while (day < workingDays && totalEmpWorkingHours < totalWorkingHours) {
			empCheck = empCheck();
			empWorkingHours = empWorkingHours(empCheck);
			empWage = empWage(empWorkingHours, wagePerHour);
			totalEmpWorkingHours += empWorkingHours;
			day++;
			totalEmpSalary += empWage;
		}
		return totalEmpSalary;
	}
}
public class EmployeeWageComputationForMultipleCompanies {
		public static void main(String[] args) {
			int totalEmpSalaryA;
			int totalEmpSalaryB;
			int totalEmpSalary;
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Welcome to Employee Wage Computation Program");
			
			totalEmpSalaryA = Employee.totalEmpSalary(20, 20, 100);
			totalEmpSalaryB = Employee.totalEmpSalary(30, 20, 100);
			
			System.out.println("Total employee salary for company A: " +totalEmpSalaryA);
			System.out.println("Total employee salary for company B: " +totalEmpSalaryB);
			
			System.out.println("Enter company name");
			String companyName = sc.next();
			System.out.println("Enter wagePerHour");
			int wagePerHour = sc.nextInt();
			System.out.println("Enter workingDays");
			int workingDays = sc.nextInt();
			System.out.println("Enter totalWorkingHours");
			int totalWorkingHours = sc.nextInt();
			
			totalEmpSalary = Employee.totalEmpSalary(wagePerHour, workingDays, totalWorkingHours);
			System.out.println("Total employee salary for company  "+companyName+ " is "+ totalEmpSalary);
		}
}

