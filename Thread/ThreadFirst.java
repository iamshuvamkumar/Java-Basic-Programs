import java.util.*;

class ThreadFirst{
	public static void main(String[]args){
     Thread th = Thread.currentThread();
     String nth = th.getName();
        System.out.println("Current Run Thread "+nth);
         System.out.println("Current Run Thread "+Thread.currentThread().getName());	
    	th.setName(" Thread ");
		nth = th.getName();
		System.out.println("Current Run Thread "+nth);
		 System.out.println("Current Run Thread "+Thread.currentThread().getName());	
	}
}