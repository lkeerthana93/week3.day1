package org.department;

import org.college.College;

public class Department extends College{
	
	public void deptName()
	{
		System.out.println("Method Department Name");
	}
	public static void main(String[] args) {
		Department dpt = new Department();
		dpt.deptName();
	}
}