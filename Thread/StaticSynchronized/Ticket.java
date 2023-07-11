package StaticSynchronized;

public class Ticket {
	
static int ticket = 20;

synchronized static void mTicket(int num) {
  if(num<=ticket) {
    		System.out.println(num+" Ticket Booked ");
    		System.out.println( (ticket-=num)+" Ticket are abblable ");
    	}
  else {
	  System.out.println();
	  System.out.println( ticket+" Ticket only abblable ");
  }
    }

}
