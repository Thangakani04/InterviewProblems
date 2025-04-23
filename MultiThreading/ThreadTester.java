package MultiThreading;

public class ThreadTester {

	public static void main(String[] args) {
		
		System.out.println("main is started ");
		Thread thread1 = new Thread1("thread1");
		thread1.start();
		Thread thread2 = new Thread(new Thread2() , "thread2");  //here passing thread name is optional
		thread2.start();
		System.out.println("main is exiting ");
		
		new Thread().run(); //because thread class also implements Runnable interface

	}

}
