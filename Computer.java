package org.system;

public class Computer
{
	public void computerModel()
	{
		System.out.println("This is Parent class  Computer Model Method");
	}
	public static void main(String[] args) {
		Computer c = new Computer();
		c.computerModel();
	}
}