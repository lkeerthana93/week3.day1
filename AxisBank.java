package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		System.out.println("Deposit method - Axis bank");
	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.savings();
	}
}
