package BusTicket;

public class PassengerBooking extends Thread {
	int book;
	String name;

	public void setData(String name, int book) {
		this.name = name;
		this.book = book;
	}

	public void run() {
		Ticket.bTicket(name, book);
	}

}
