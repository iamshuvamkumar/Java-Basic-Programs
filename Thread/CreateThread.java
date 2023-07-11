import java.lang.*;
class CreateThread extends Thread{
	
	public void run(){
      System.out.println("1");
	}
	public static void main(String[]args){
		CreateThread obj  = new CreateThread();
		obj.start();				
		
	}
}