class ThreadIntrrupted extends Thread{
	 public void run(){
		 //System.out.println(Thread.interrupted());
		//System.out.println(Thread.interrupted());
		 //System.out.println(Thread.currentThread().isInterrupted());
		 try{
			 for(int i=1;i<=5;i++){
				 System.out.println(i);
				 Thread.sleep(2000);
				 System.out.println(Thread.interrupted());
			 
			 }
		 }
		 catch(Exception e){
			 System.err.print(e);
		 }
	 }
	
	public static void main (String[]args){
	 ThreadIntrrupted tid = new ThreadIntrrupted();
       tid.start();	 
	   tid.interrupt();
	}
}