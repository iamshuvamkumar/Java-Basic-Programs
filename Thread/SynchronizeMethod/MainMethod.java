package Thread.SynchronizeMethod;

public class MainMethod {

	public static void main(String[] args) {
		Method d = new Method();
		CustomThread c = new CustomThread("1st",d);
		CustomThread1 c1 = new CustomThread1("2nd",d);
		CustomThread2 c2 = new CustomThread2("3rd",d);
	}

}
