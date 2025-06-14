package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

    
}

public class Sortingproblems {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
			    new Person("Alice", 30),
			    new Person("Bob", 25),
			    new Person("Charlie", 35)
			);
		
		List<String> sorted = people.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.map(p -> p.getName())
				.collect(Collectors.toList());
		System.out.println(sorted);
		
		List<String> result = people.stream()
				.sorted((p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()))
				.map(p -> p.getName())
				.collect(Collectors.toList());
		System.out.println(result);
		
		List<String> result1 = people.stream()
				.sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
				.map(p -> p.getName())
				.collect(Collectors.toList());
		
		System.out.println(result1);
		
		
		
	}

}
