package InterviewProblems;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionsInJava {
	

	public static void main(String[] args) {
		
		compileTimeException();
		compileTimeException1();
		runTimeException();
		nullPointerException();
	}

	public static void compileTimeException1() {
		try {
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "username", "password");
			 Statement stmt = conn.createStatement();
			 stmt.executeQuery("Select * from non_exist_tab");
		}
		catch(SQLException e) {
			System.out.println("Compile time exception " + e);
		}
		
		
	}

	public static void nullPointerException() {
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception "+ e);
		}
		
	}

	public static void runTimeException() {
		
		try {
			int n =10/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception " + e);
		}
		
		
	}

	public static void compileTimeException() {
		
		try {
			FileReader fl = new FileReader("non_existing_file.txt");
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Compile time exception "+ e);
		}
		
	}

}
