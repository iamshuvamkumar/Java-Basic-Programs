package Thread;

class MyThread implements Runnable {
	String str;
	Thread t;
	Boolean cout;
	public Object h;

	MyThread(String name) {
		str = name;
		t = new Thread(this, str);
		cout = false;
		t.start();
	}

	@Override
	public void run() {
		try {
			for(int i = 30; i > 15; i--) {
				System.out.println(str + ": " + i);
				Thread.sleep(200);
				synchronized(this) {
					while(cout) {
						wait();
					}
				}
			}
		}
	catch(Exception e){
		System.out.println(str + " Suspended..."+e);
     }
	}
	void mysuspend() {
		cout = true;
	}

	synchronized void myresume() {
		cout = false;
		notify();
	}
}
class MySuspend{
	public static void main(String[] args) {
		MyThread ob1 = new MyThread("One");
		
		MyThread ob2 = new MyThread("Two");
		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspending One...");
			Thread.sleep (1000);
			ob1.myresume();
			System.out.println("Resuming One...");
			ob2.mysuspend();
			System.out.println("Suspending Two...");
			Thread.sleep(1000);
		  ob2.myresume();
			System.out.println("Resuming Two...");
		}
		catch (InterruptedException e) {
			System.out.println("Main thread Suspended...");
		}
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		}
		catch (InterruptedException e) {
		System.out.println("Main thread Suspended");
		}
		System.out.println("Main thread exiting...");
		
}
}