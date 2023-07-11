class ThreadisInterrupted extends Thread{
	 public void run(){
		  System.out.println(Thread.currentThread().isInterrupted());
		 try{
			 for(int i=1;i<=5;i++){
				 System.out.println(i);
				 Thread.sleep(2000);
              //System.out.println(Thread.currentThread().isInterrupted()); //not working inside try 
			 
			 }
		 }
		 catch(Exception e){
			 System.err.print(e);
		 }
	 }
	 //System.out.println(Thread.currentThread().isInterrupted()); its only working in top of try
	
	public static void main (String[]args){
	 ThreadisInterrupted tid = new ThreadisInterrupted();
       tid.start();	 
	   tid.interrupt();
	}
}