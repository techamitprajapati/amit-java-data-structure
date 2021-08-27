package datastructure.practices.list.stream.utility;

import java.util.Comparator;
import java.util.List;

import datastructure.practices.list.stream.beans.Employee;

public class DscByNameComperator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getEmpName().compareTo(o1.getEmpName());
	}

}
