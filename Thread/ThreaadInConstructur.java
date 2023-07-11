package Thread;

class Constructur extends Thread{
	String tname;
	Constructur(){}//Default Constructur
		public Constructur(String name) { //Per Constructur
			super(name);
			this.tname = name;
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
class Constructur1 implements Runnable{
	String tname;
	Thread t1;
	Constructur1(){}
	public Constructur1(String name) {
	   t1 = new Thread(this,name);
		this.tname = name;
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
class Constructur2 implements Runnable{
	String tname;
	Thread t1;
	Constructur2(){}
	public Constructur2(String name) {
	   t1 = new Thread(this,name);
		this.tname = name;
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
public class ThreaadInConstructur{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructur c = new Constructur("RAM");
		Constructur1 c1 = new Constructur1("Radha");
		Constructur2 c2 = new Constructur2("Krishna");
		try {
			System.out.println("live ===========? "+c.isAlive());
			c.join();
			c1.t1.join();
			c2.t1.join();
			
		} catch (Exception e) {
		System.out.println(e);
		}
		System.out.println("live ===========? "+c.isAlive());
	}

}
