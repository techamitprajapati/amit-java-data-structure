package datastructure.practices.list.stream.test;

import java.util.List;

import datastructure.practices.list.stream.beans.Employee;
import datastructure.practices.list.stream.utility.StudentStream;

public class EmployeeTest {

	public static void main(String[] args) {
		StudentStream stream = new StudentStream();
		stream.addEmployeeList();
		List<Employee> list = stream.getEmployeeList();
//		stream.showEmployeeList(list);
//		stream.showEmployeeListWithLambda(list);
//		stream.showEmployeeListEmpIdWithLambda(list);
//		stream.showEmployeeListEmpSalaryWithlambda(list);
//		List<Employee> elist = stream.showEmployeeListEmpNameByAscOrderWithlambda(list);
		List<Employee> elist = stream.showEmployeeListEmpNamrByDscOrder(list);
		System.out.println(elist);

	}

}
