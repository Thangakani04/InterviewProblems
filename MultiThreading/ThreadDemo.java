package MultiThreading;

class Hi extends Thread
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

class Hello extends Thread
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

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to java programming");
		Hi obj =new Hi();
		Hello obj1 = new Hello();
		
		obj.start();
		obj1.start();
		//obj.show();
		//obj1.show();
		
		
		
	}

}
