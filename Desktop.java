package org.system;

public class Desktop extends Computer {
	public void desktopSize()
	{
		System.out.println("This is Desktop size - child class of Computer");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopSize();
		d.computerModel();
	}

}
