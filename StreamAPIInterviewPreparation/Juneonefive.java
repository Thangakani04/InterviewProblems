package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp16 {
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
	public Emp16(String name, double salary , int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp16 [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
}

public class Juneonefive {
	
	public static void main(String[] args) {
		
		sortingbyCustomsorted();
	}

	public static void sortingbyCustomsorted() {
		List<Emp16> employees = Arrays.asList(
			    new Emp16("Alice", 70000.50,26),
			    new Emp16("Bob", 55000.00,27),
			    new Emp16("Charlie", 80000.75,30)
			);
		
		List<String> sort = employees.stream()
				.sorted(Comparator.comparingInt(Emp16::getAge).thenComparing(Emp16::getName))
				.map(emp -> emp.getName())
				.collect(Collectors.toList());
		
		System.out.println("Sort " + sort);
		
		//Group Employees by Age
		Map<Integer,List<String>> map = employees.stream()
				.collect(Collectors.groupingBy(Emp16::getAge, Collectors.mapping(Emp16::getName, Collectors.toList())));
		
		System.out.println("Map " + map);
		
		Map<Integer, List<Emp16>> map1 = employees.stream()
				.collect(Collectors.groupingBy(Emp16::getAge));
		
		System.out.println(map1);
		
		map1.entrySet().forEach(ent -> System.out.println(ent.getKey() + " " + ent.getValue().toString()));
				
		
		//Group Employees by Age, and Sort Each Group by Name
		
		Map<Integer , List<Emp16>> map2 = employees.stream()
				.collect(Collectors.groupingBy(Emp16::getAge, 
						Collectors.collectingAndThen(Collectors.toList(), l -> l.stream()
				.sorted(Comparator.comparing(Emp16::getName))
				.collect(Collectors.toList()))));
		
		System.out.println("map2" + map2);
		
		Map<Integer, List<Emp16>> map5 = employees.stream()
				.collect(Collectors.groupingBy(Emp16::getAge , 
						Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
								.sorted(Comparator.comparing(Emp16::getName))
								.collect(Collectors.toList()))));
		
		System.out.println("map5" + map5);
		
		
				
		
	}

}
