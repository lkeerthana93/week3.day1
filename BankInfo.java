package week3.day1;

public class BankInfo{
	public void savings()
	{
		System.out.println("Savings Method - Bank Info");
	}
	public void fixed()
	{
		System.out.println("Fixed Method - Bank Info");
	}
	public void deposit()
	{
		System.out.println("Deposit Method - Bank Info");
	}
	public static void main(String[] args) {
		BankInfo bi = new BankInfo();
		bi.savings();
		bi.fixed();
		bi.deposit();		
	}
}
