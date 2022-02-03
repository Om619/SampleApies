package Inheritance;

public class EmployeeDetails extends Department{
	private String EmployeeId;
	private String EmployeeName;
	private double EmployeeSalary;
	private short EmployeeAge;
	private long EmployeeNumber;
	private String EmployeeMailId;
	EmployeeDetails(String EmployeeId, String EmployeeName, double EmployeeSalary, sort EmployeeAge, long EmployeeNumber,String EmployeeMailid )
	{
		
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		if(employeeSalary==0)
		{
			System.out.println("Please Enter the Salary more than Zero");
			System.exit(0);
		}		
		if(employeeSalary>0 &&employeeSalary<=50000)
		{
		EmployeeSalary = (employeeSalary*0.1)+employeeSalary;
		}
		else
		{
			EmployeeSalary=(employeeSalary*.15)+employeeSalary;
		}
	}
	public short getEmployeeAge() {
		return EmployeeAge;
	}
	public void setEmployeeAge(short employeeAge) {
		EmployeeAge = employeeAge;
	}
	public long getEmployeeNumber() {
		return EmployeeNumber;
	}
	public void setEmployeeNumber(long employeeNumber) {
		EmployeeNumber = employeeNumber;
	}
	public String getEmployeeMailId() {
		return EmployeeMailId;
	}
	public void setEmployeeMailId(String employeeMailId) {
		EmployeeMailId = employeeMailId;
	}

}
