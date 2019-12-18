package com.csi.coreconcept;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	int empId;

	String empName;

	int empAge;

	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		if (e1.empAge == empAge) {
			return 0;
		} else if (e1.empAge < empAge) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class ComparableConcept {
	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(121, "JERRY", 23));
		employeeList.add(new Employee(120, "TOM", 20));
		employeeList.add(new Employee(127, "ANUJA", 21));

		Collections.sort(employeeList);

		employeeList.forEach(System.out::println);
	}
}
