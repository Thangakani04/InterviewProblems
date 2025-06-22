package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmpPrac {
    int id;
    String name;
    int age;
    String department;

    EmpPrac(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
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



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
    public String toString() {
        return "EmpPrac{id=" + id + ", name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}

public class GroupByempandSortage {
	
	public static void main(String[] args) {
		
		List<EmpPrac> Employees = Arrays.asList(
	            new EmpPrac(1, "Alice", 30, "HR"),
	            new EmpPrac(2, "Bob", 25, "IT"),
	            new EmpPrac(3, "Charlie", 28, "HR"),
	            new EmpPrac(4, "David", 35, "IT"),
	            new EmpPrac(5, "Eva", 40, "Finance"),
	            new EmpPrac(6, "Frank", 22, "Finance")
	        );
		
		Map<String, List<EmpPrac>> result = Employees.stream()
				.collect(Collectors.groupingBy(
						emp -> emp.getDepartment() , 
						Collectors.collectingAndThen(
								Collectors.toList(), list -> list.stream()
								.sorted(Comparator.comparingInt(emp ->emp.getAge()))
								.collect(Collectors.toList()))));
		
		System.out.println(result);
		
	}

}
