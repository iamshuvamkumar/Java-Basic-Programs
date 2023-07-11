
public class SleepThread extends Thread{
        @Override
        public void run() {
        	try {
				for(int i=1;i<=5;i++) {
					//sleep(1500);
					System.out.println(i+" "+Thread.currentThread().getName());
				}
			} catch (Exception e) {
				System.err.println(e);
			}
        }
	
	public static void main(String[] args) {
	    SleepThread obj = new SleepThread();
	    SleepThread obj1 = new SleepThread();
	    obj.start();
	    try {
			obj.sleep(1500);
			obj1.start();			
		} catch (Exception e) {
		  System.out.println(e);
		}
		
	}
}
