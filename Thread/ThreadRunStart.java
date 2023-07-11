import java.util.*;
class ThreadRunStart extends Thread{
      
	 public void run(){
		 Thread t = Thread.currentThread();
		  System.out.println("Start Run Merhod "+t.getName());
		  for(int i=0;i<5;i++){
			  System.out.println("i "+i+" "+t.getName());
			  try{
				  Thread.sleep(1500);
			  }
			  catch(Exception x){
				  x.printStackTrace();
			  }
		  }
		  
		  System.out.println("End Run Merhod "+t.getName());
	  }
	  
	public static void main(String[]args){
		Thread t = Thread.currentThread();
		System.out.println("Start MAin Method ");
		ThreadRunStart th  = new ThreadRunStart();
		//th.run();
		th.start();
		ThreadRunStart th1  = new ThreadRunStart();
		th1.start();
		ThreadRunStart th2  = new ThreadRunStart();
		th2.start();
		ThreadRunStart th3  = new ThreadRunStart();
		th3.start();
		System.out.println("End MAin Method ");
		
		 for(int i=0;i<5;i++){
			  System.out.println("i "+i+" "+t.getName());
			  try{
				  Thread.sleep(1500);
			  }
			  catch(Exception x){
				  x.printStackTrace();
			  }
		  }
	 }
	}