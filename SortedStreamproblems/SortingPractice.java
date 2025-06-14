package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Emp15 {
    String name;
    double salary;
    int age;
    
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp15(String name, double salary , int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

    
 
}

public class SortingPractice {
	
	public static void main(String[] args) {
		
		sortEmployees();
	}

	public static void sortEmployees() {
		
		List<Emp15> employees = Arrays.asList(
			    new Emp15("Alice", 70000.50,26),
			    new Emp15("Bob", 55000.00,27),
			    new Emp15("Charlie", 80000.75,30)
			);
		
		List<String> output = employees.stream()
				.sorted(Comparator.comparingDouble(emp -> emp.getSalary()))
				.map(emp -> emp.getName())
				.collect(Collectors.toList());
		
		System.out.println(output);
		
		//Filter Employees with Salary > 60,000 and Sort by Salary Descending
		
		List<String> res1 = employees.stream()
				.filter(emp -> emp.getSalary() > 60000)
				.sorted(Comparator.comparing(emp -> emp.getSalary() , Comparator.reverseOrder()))
				.map(emp -> emp.getName())
				.collect(Collectors.toList());
		
		System.out.println(res1);
		
		//Get the Name(s) of the Employee(s) with the Highest Salary
		
		Optional<String> res2 = employees.stream()
				.sorted(Comparator.comparing(emp -> emp.getSalary(), Comparator.reverseOrder()))
				.map(emp -> emp.getName())
				.findFirst();
		
		System.out.println(res2.get());
		
		//using max
		
		Optional<String> res3 = employees.stream()
				.max((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.map(e -> e.getName());
				
		System.out.println(res3.get());
		
		List<String> res4 = employees.stream()
				.sorted((e1,e2) -> Integer.compare(e2.getAge(), e1.getAge()))
				.map(e -> e.getName())
				.collect(Collectors.toList());
		
		System.out.println(res4);
		
		List<String> res5 = employees.stream()
				.sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
				.map(e -> e.getName())
				.collect(Collectors.toList());
		
		System.out.println(res5);
				

		
	}

}
