
public class Employee implements Comparable<Employee> {
	int employeeNumber;
	String employeeName;
	double employeeSalary;
	public Employee(int employeeNumber, String employeeName, double employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public int compareTo(Employee employee) {
		int result;

		if (this.employeeSalary < employee.getEmployeeSalary())
			result = -1;
		else if (this.employeeSalary > employee.getEmployeeSalary())
			result = 1;
		else //same salary
			result = 0;
		return result;
	}

}
