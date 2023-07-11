package BusTicket;

public class Ticket {
	static int ticket = 30;

	synchronized static void bTicket(String name, int x) { //method
		try {

			if (x <= ticket) {
				System.out.println(name + "@RedBus--> | " + x + " | Bus Ticket is complet");
				ticket -= x;
				System.out.println(ticket + " Ticket are available\n");
			} else {
				System.out.println("\n Bus Ticket are available " + ticket + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
