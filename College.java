package org.college;

public class College
{
	public void collegeName()
	{
		System.out.println("Method College Name");
	}
	public void collegeCode()
	{
		System.out.println("Method College Code");
	}
	public void collegeRank()
	{
		System.out.println("Method College Rank");
	}
	public static void main(String[] args) {
		College cl = new College();
		cl.collegeName();
		cl.collegeCode();
		cl.collegeRank();
	}
}