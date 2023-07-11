package StaticSynchronized;

public class MovieTicket {
	public static void main(String[] args) {
		Ticket t = new Ticket();
		myThread m  = new myThread(t,6); 
		m.start();
		myThread1 m1  = new myThread1(t,6); 
		m1.start();
		Ticket t1 = new Ticket();
		myThread m2  = new myThread(t1,6); 
		m2.start();
		myThread1 m3  = new myThread1(t1,6); 
		m3.start();
	}
}
