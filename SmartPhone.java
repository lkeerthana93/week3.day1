package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsApp()
	{
		System.out.println("Connect Whatsapp");
	}
	public void takeVideo()
	{
		System.out.println("Take a video with Smartphone");
	}
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.connectWhatsApp();
		sp.takeVideo();
	}
}
