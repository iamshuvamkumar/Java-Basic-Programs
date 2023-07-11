package Driving;

public class Madical  extends Thread{
	public void run() {
		try {
			System.out.println("Start Madical Test ");
			sleep(2000);
			System.out.println("End Madical Test");
			sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
