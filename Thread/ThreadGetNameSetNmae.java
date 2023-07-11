package Thread;

public class ThreadGetNameSetNmae {

	public static void main(String[] args) {
		Thread TName = Thread.currentThread(); // default Main Thread created by JVM 
		System.out.println(TName);
		System.out.println(Thread.currentThread().getName()); //Get Thread Name
		String name = "MyThread";
		Thread.currentThread().setName(name);   //Set Thread Name
		System.out.println(Thread.currentThread().getName());
	}

}
