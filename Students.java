package week3.day1;

public class Students {
	public void getStudentInfo(int stdId)
	{
		System.out.println("The student id is : " + stdId);
	}
	public void getStudentInfo(int stdId, String stdName)
	{
		System.out.println("The student id is :  and " + stdId + "the Student name is : " + stdName);
	}
	public void getStudentInfo(long mob, String email)
	{
		System.out.println("The student mobile number is : " + mob + " and email id is : " + email);
	}
	public static void main(String[] args) {
		Students ss = new Students ();
		ss.getStudentInfo(1001);
		ss.getStudentInfo(1,"Arjun");
		ss.getStudentInfo(1234567890L, "arjun@gmail.com");
	}
}
