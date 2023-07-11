import java.util.Iterator;
import java.lang.*;
public class ThreadYield extends Thread {
	@Override
	public void run() {
    for(int i=1;i<=5;i++) {
    Thread.yield();
    	System.out.println(Thread.currentThread().getName()+" - "+i);
    }
	}

	public static void main(String[] args) {
		ThreadYield yt =  new ThreadYield();
		yt.start();
		
		for(int i=1;i<=5;i++) {
	    	System.out.println(Thread.currentThread().getName()+" - "+i);
	    }
	}
}
