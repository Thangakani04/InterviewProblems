package MultiThreading;

public class MultiThreadinJoinIsAlive {
	
	public static void main(String[] args) throws Exception {
		
		Thread t3 = new Thread(()-> {
			
			for(int i=0;i<=5;i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		
	});
		Thread t4 = new Thread(() -> {
			
			for(int i=0;i<=5;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					
				}
			}
		
	});
		
		t3.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		t4.start();	
		
		System.out.println(t3.isAlive());
		
		t3.join();
		t4.join();  //if we don't use join() method Thank you will be printing parallely, we want thank will be printed at the end, so we should ask main to wait t3,t4 threads complete their execution
		
		System.out.println("Thank you!!");
		
		System.out.println(t3.isAlive());
		
	}

}
