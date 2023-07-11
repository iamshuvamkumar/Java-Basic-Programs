package mythread;
class CustomThread extends Thread{
	String tname;
	CustomThread(){ }
	public CustomThread(String tname) {
		super(tname);
		this.tname = tname;
		start();
	}
	public  void run() {
		Thread t1 = Thread.currentThread();
		System.out.println("Start in run ...  "+t1.getName());
		for(int i = 0; i <=5; i++) {
			System.out.println("i =  "+i+"    "+t1.getName());
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("End of  run ...  "+t1.getName());
	}
}
class CustomThread1 implements Runnable{
	String tname;
	Thread t1;
	CustomThread1(){ }
	public CustomThread1(String tname) {

		this.tname = tname;
		t1 = new Thread(this, tname);
		t1.start();
	}
	public  void run() {
		Thread t1 = Thread.currentThread();
		System.out.println("Start in run ...  "+t1.getName());
		for(int i = 0; i <=5; i++) {
			System.out.println("i =  "+i+"    "+t1.getName());
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}

		}

		System.out.println("End of  run ...  "+t1.getName());

	}


}

class CustomThread2 implements Runnable{
	String tname;
	Thread t1;
	CustomThread2(){ }
	public CustomThread2(String tname) {

		this.tname = tname;
		t1 = new Thread(this, tname);
		t1.start();
	}
	public  void run() {
		Thread t1 = Thread.currentThread();
		System.out.println("Start in run ...  "+t1.getName());
		for(int i = 0; i <=5; i++) {
			System.out.println("i =  "+i+"    "+t1.getName());
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}

		}

		System.out.println("End of  run ...  "+t1.getName());
	}
}
public class MultiThread {
  public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println("\nStart in main ...  "+t1.getName());
		CustomThread obj = new CustomThread("MyThread -1");
		CustomThread1 obj1 = new CustomThread1("MyThread -2");
		CustomThread2 obj2 = new CustomThread2("MyThread -3");
		try {
			obj.join();
			obj1.t1.join();
			obj2.t1.join();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("End of  main ...  "+t1.getName());
	}
}

