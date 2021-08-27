package datastructure.practices.list.stream.beans;

public class Employee {
	public int empId;
	public String empName;
	public int empSalary;
	public String empDept;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Employee(int empId, String empName, int empSalary, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept="
				+ empDept + "]\n";
	}

}
