package InterviewProblems;

public class SingletonClass {
	
	private static SingletonClass instance;
	
	private SingletonClass() {
		System.out.println("Single instance created ");
	}
	
	public static SingletonClass getInstace() {
		
		if(instance == null) {
			instance = new SingletonClass();
		}
		return instance;
		
	}
	
	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstace();
		SingletonClass s2 = SingletonClass.getInstace();
		
		System.out.println(s1==s2);
	}

}
