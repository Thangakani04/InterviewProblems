package MultiThreading;

class Example1 implements Runnable
{
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
	}
	
}

class Example2 implements Runnable
{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
	}
}

public class ThreadRunnable {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to java programming");
		Example1 obj =new Example1();
		Example2 obj1 = new Example2();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		t1.start();
		t2.start();
		//obj.show();
		//obj1.show();
		
		
		
	}

}
