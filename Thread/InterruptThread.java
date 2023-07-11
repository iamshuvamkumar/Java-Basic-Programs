
public class InterruptThread extends Thread {

	public void run(){
		try{
	      System.out.println("1");
		  Thread.sleep(2000);
		}
		catch(Exception e){
			System.out.println("InterruptThread Error "+e);
		}
	}
		public static void main(String[]args){
			InterruptThread ti  = new InterruptThread();
			ti.start();	
            ti.interrupt();			
			
		}
	}