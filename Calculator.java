package week3.day1;

public class Calculator {

	public void add(int num1, int num2)
	{
		System.out.println(num1+num2);
	}
	public void add(int num1, int num2, int num3)
	{
		System.out.println(num1+num2+num3);
	}
	public void sub(int num1, int num2)
	{
		System.out.println(num1-num2);
	}
	public void sub(double num1, double num2)
	{
		System.out.println(num1-num2);
	}
	public void mul(int num1, int num2)
	{
		System.out.println(num1*num2);
	}
	public void mul(double num1, int num2)
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator ();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.sub(20, 10);
		c.sub(22.22, 11.11);
		c.mul(10, 20);
		c.mul(22.22, 20);
	}
}
