package InterviewProblems;

public class Singleton {
	
	public static void main(String[] args) {
		
		
	}
	
	private static volatile Singleton instance;
	
	
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized (Singleton.class) {
				if(instance==null) instance = new Singleton();
			}
		}
		return instance;
	}


	private Singleton(){
		
	}

}
