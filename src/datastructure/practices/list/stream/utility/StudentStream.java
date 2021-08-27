package datastructure.practices.list.stream.utility;

import java.util.ArrayList;
import java.util.List;

import datastructure.practices.list.stream.beans.Employee;
import datastructure.practices.list.stream.services.AscByNameComperator;

public class StudentStream {
	List<Employee> emplist = new ArrayList<Employee>();

	public void addEmployeeList() {
		emplist.add(new Employee(301, "Ram Kumar", 13000, "Cleark"));
		emplist.add(new Employee(201, "Raja Kumar", 43000, "manager"));
		emplist.add(new Employee(101, "shyam Kumar", 23000, "Asst.manager"));
		emplist.add(new Employee(401, "Ranjeet Kumar", 33000, "Asst.manager"));
		emplist.add(new Employee(501, "Ram Kumar", 50000, "Cleark"));
	}

	public List<Employee> getEmployeeList() {
		return emplist;
	}

	public void showEmployeeList(List<Employee> list) {
		System.out.println(emplist);
	}

	public void showEmployeeListWithLambda(List<Employee> list) {
		list.stream().forEach(e -> System.out.println(emplist));
	}

	public void showEmployeeListEmpIdWithLambda(List<Employee> list) {
		list.stream().filter(e -> e.getEmpId() > 301).forEach(e -> System.out.println(e));
	}

	public void showEmployeeListEmpSalaryWithlambda(List<Employee> list) {
		list.stream().filter(e -> e.getEmpSalary() >= 30000).forEach(e -> System.out.println(e));
	}

	public List<Employee> showEmployeeListEmpNameByAscOrderWithlambda(List<Employee> list) {
		list.sort(new AscByNameComperator());
		return list;
	}

	public List<Employee> showEmployeeListEmpNamrByDscOrder(List<Employee> list) {
		list.sort(new DscByNameComperator());
		return list;
	}

}
