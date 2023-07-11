package BusTicket;

public class RedBus // extends PassengerBooking
{

	public static void main(String[] args) {

		PassengerBooking p1 = new PassengerBooking();
		PassengerBooking p2 = new PassengerBooking();
		PassengerBooking p3 = new PassengerBooking();

		p1.setData("shivam", 14);
		p1.start();

		p2.setData("kuldeep", 1);
		p2.start();

		p3.setData("anjali", 8);
		p3.start();

	}
}
