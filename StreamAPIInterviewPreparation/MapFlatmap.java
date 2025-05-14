package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee1{
	
	int id;
	String name;
	List<String> citiesWorkedIn;
	
	public Employee1(int id, String name, List<String> citiesWorkedIn) {
		super();
		this.id = id;
		this.name = name;
		this.citiesWorkedIn = citiesWorkedIn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCitiesWorkedIn() {
		return citiesWorkedIn;
	}
	public void setCitiesWorkedIn(List<String> citiesWorkedIn) {
		this.citiesWorkedIn = citiesWorkedIn;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", citiesWorkedIn=" + citiesWorkedIn + "]";
	}
	
	
}

public class MapFlatmap {
	
	public static void main(String[] args) {
		
		List<String> cities1 = new ArrayList<String>();
		cities1.add("Chennai");
		cities1.add("Banglore");
		cities1.add("Mumbai");
		cities1.add("Hyderabad");
		cities1.add("Pune");
		cities1.add("Mumbai");
		
		Employee1 e1 = new Employee1(1, "Kani", cities1);
		
		List<String> cities2 = new ArrayList<String>();
		cities2.add("Chennai");
		cities2.add("Noida");
		cities2.add("Mysore");
	
		Employee1 e2 = new Employee1(2, "Nivi", cities2);
		
		List<String> cities3 = new ArrayList<String>();
		cities3.add("Mysore");
		cities3.add("Noida");
		cities3.add("Indore");

		
		Employee1 e3 = new Employee1(3, "Sweta", cities3);
		
		List<Employee1> empList = new ArrayList<Employee1>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		System.out.println(empList);
		
		List<Integer> ids = empList.stream().map(e -> e.getId()).collect(Collectors.toList());
		System.out.println("Ids of employees :" + ids);
		
		List<String> names = empList.stream().map(e -> e.getName()).collect(Collectors.toList());
		System.out.println("names of employees :" + names);
		
		List<List<String>> citiesoutput = empList.stream().map(e -> e.getCitiesWorkedIn()).collect(Collectors.toList());
		System.out.println("cities of employees using map  :" + citiesoutput);
		List<String> cities1output = empList.stream().flatMap(e -> e.getCitiesWorkedIn().stream()).collect(Collectors.toList());
		System.out.println("cities of employees using flatmap :" + cities1output);
		
		//without duplicates
		Set<String> cities1output1 = empList.stream().flatMap(e -> e.getCitiesWorkedIn().stream()).collect(Collectors.toSet());
		System.out.println("cities of employees using  Set flatmap :" + cities1output1);
		
		
	}

}
