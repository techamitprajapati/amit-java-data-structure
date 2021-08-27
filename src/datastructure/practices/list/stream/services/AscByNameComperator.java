package datastructure.practices.list.stream.services;

import java.util.Comparator;

import datastructure.practices.list.stream.beans.Employee;

public class AscByNameComperator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
	
}
