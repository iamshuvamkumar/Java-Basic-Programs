import java.lang.*;

class DemonThread implements Runnable{
	
	public void run(){
		System.out.println(Thread.currentThread().isDaemon());
	}
	
	
	public static void main(String[]args){
		DemonThread obj  = new DemonThread();
		System.out.println("This is Main Thread");
		Thread t = new Thread(obj);
		//t.setDaemon(true);
		t.start();				
		
	}
}