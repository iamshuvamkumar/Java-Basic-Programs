class MovieBox {
	static int ticket = 15;

	 public void tmovie(int tic) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			if (tic <= ticket) {
				System.out.println("You Buy " + tic + " Ticet");
				ticket -= tic;
				System.out.println(ticket + " Ticket are ablabile");
			} else {
				System.out.println(ticket + " Ticket are ablabile");
			}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());

	}
}

class movie extends Thread {

	int ticket;

	public void run() {
		MovieBox movieBox = new MovieBox();
		movieBox.tmovie(ticket);
	}

}

public class ThreadSynchronizedBlock {

	public static void main(String[] args) {
		movie m = new movie();
		m.ticket = 5;
		m.start();
		movie m1 = new movie();
		m1.ticket = 10;
		m1.start();

	}

}
