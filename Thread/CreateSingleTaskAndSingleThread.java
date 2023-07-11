import java.lang.*;

//class CreateSingleTaskAndSingleThread extends Thread {
class CreateSingleTaskAndSingleThread implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        CreateSingleTaskAndSingleThread tem = new CreateSingleTaskAndSingleThread();
        Thread t = new Thread(tem);
        t.setName("Hi");
        t.start();
    }
}