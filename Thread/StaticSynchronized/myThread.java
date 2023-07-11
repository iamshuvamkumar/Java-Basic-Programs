package StaticSynchronized;

public class myThread extends Thread {
	Ticket t;
	int seat;

	public myThread(Ticket t, int seat) {
		this.t = t;
		this.seat = seat;
	}

	public void run() {
		t.mTicket(seat);
	}
}
class myThread1 extends Thread {
	Ticket t;
	int seat;

	public myThread1(Ticket t, int seat) {
		this.t = t;
		this.seat = seat;
	}

	public void run() {
		t.mTicket(seat);
	}
}

