package Driving;

class SignIn extends Thread {
	public void run() {
		try {
			System.out.println("Start Sign ");
			sleep(6000);
			System.out.println("End  Sign");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
