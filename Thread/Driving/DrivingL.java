package Driving;

public class DrivingL {

	public static void main(String[] args) {
		try {
		Madical md = new Madical();
		md.start();
		md.join();
		DriveTest dt = new DriveTest();
		dt.start();
		dt.join();
		SignIn s = new SignIn();
		s.start();
		
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
