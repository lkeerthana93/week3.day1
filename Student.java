package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Method Student Name");
	}
	public void studentDept()
	{
		System.out.println("Method Student Department");
	}
	public void studentId()
	{
		System.out.println("Method Student ID");
	}
	public static void main(String[] args) {
		Student std = new Student();
		std.studentName();
		std.studentDept();
		std.studentId();
		std.deptName();
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
	}
}