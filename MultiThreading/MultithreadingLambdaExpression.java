package MultiThreading;

public class MultithreadingLambdaExpression {
	
	public static void main(String[] args) {
		
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
		
	}

}
