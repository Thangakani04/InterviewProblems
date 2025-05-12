package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class People{
	String name;
	int age;
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
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
	
}

public class ComparatorExample {
	
	public static void main(String[] args) {
		
		sortedpeopleByAge();
	}

	public static void sortedpeopleByAge() {
		//Given a list of people with age and name, return the names of people older than 30, sorted by age descending.
		List<People> list = Arrays.asList(new People("Kani" ,25),
				new People("Swetha" ,27),
				new People("Nivi" ,24),
				new People("Anu" ,31),
				new People("Kayal" ,30),
				new People("Sumi" ,28),
				new People("Saro" ,40),
				new People("Vincy" ,32));
		List<People> sortedPeople = list.stream().filter(p-> p.age >30).sorted(Comparator.comparingInt(People::getAge))
				.collect(Collectors.toList());
		sortedPeople.forEach(p -> System.out.println(p.name + " - " + p.age));
		
		List<People> sortedPeople1 = list.stream().filter(p-> p.age >30).sorted(Comparator.comparingInt(p -> p.age))
				.collect(Collectors.toList());  //without method reference
		
		for(People p : sortedPeople) {
			System.out.println(p.name + " - " + p.age);
		}
		
		
	}

}
