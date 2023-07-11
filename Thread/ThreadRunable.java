import java.util.*;
class ThreadRunable implements Runnable{
	
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println("Start in run ... "+t.getName());
		for(int i=0;i<=5;i++){
			System.out.println("i "+i+" "+t.getName());
			try{
				Thread.sleep(1500);
			}
			catch(Exception x){
				x.printStackTrace();
			}
		}
		
		
		System.out.println("End in run ... "+t.getName());
	}
	
	public static void main(String[]args){
		
	Thread t = Thread.currentThread();
	
		System.out.println("Start Main Method.... "+t.getName());
		
		ThreadRunable th  = new ThreadRunable();
		Thread tobj = new Thread(th);
		tobj.start();
		
		ThreadRunable th1  = new ThreadRunable();
		Thread tobj1 = new Thread(th1);
		tobj1.start();
		
		ThreadRunable th2  = new ThreadRunable();
		Thread tobj2 = new Thread(th2);
		tobj2.start();
		for(int i=0;i<=5;i++){
			System.out.println("i "+i+" "+t.getName());
			try{
				Thread.sleep(1500);
			}
			catch(Exception x){
				x.printStackTrace();
			}
		}
		System.out.println("End Main Method.... "+t.getName());
	}
}