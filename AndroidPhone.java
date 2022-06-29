package week3.day1;

public class AndroidPhone extends Mobile {
	
	public void takeVideo()
	{
		System.out.println("Take a video with Android phone");
	}
	
	public static void main(String[] args) {
		AndroidPhone a = new AndroidPhone();
		a.sendMsg();
		a.makeCall();
		a.saveContact();
		a.takeVideo();
	}
}
