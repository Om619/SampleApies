package Inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails Emp=new EmployeeDetails();
		Emp.setEmployeeId("101");
		Emp.setEmployeeName("Zaid");
		Emp.setEmployeeAge((short)26);
//		Emp.setEmployeeSalary(25000);
		Emp.setEmployeeNumber(1234567890);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Salary");
		float salary = sc.nextFloat();
		Emp.setEmployeeSalary(salary);
				
//		Emp.getEmployeeAge(25);
		System.out.println("Employee Id = "+Emp.getEmployeeId());
		System.out.println("Employee Name = "+Emp.getEmployeeName());
		System.out.println("Employee Salary = "+Emp.getEmployeeSalary());
		System.out.println("Employee Age = "+Emp.getEmployeeAge());
		//Emp.setCompanyID("Torus121");
		//System.out.println(Emp.getCompanyID());
		sc.close();
		
		
	}

}
