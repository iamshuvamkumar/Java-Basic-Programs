package Driving;

class DriveTest extends Thread {
	public void run() {
		try {
			System.out.println("Start Driving Test Test ");
			sleep(4000);
			System.out.println("End Driving Test Test");
			sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}