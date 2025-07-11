package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeComputation {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11800.5));
		employeeList.add(new Employee(211, "jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		
		Map<Object, List<Employee>> output = employeeList.stream().collect(Collectors.groupingBy(emp -> emp.department));
		//System.out.println("output " + output);
		
		output.entrySet().forEach(ent -> {
			System.out.println(ent.getKey() + " " + ent.getValue());
		});
		List<String> words = Arrays.asList("java" ,"java" ,"springboot","spring" ,"java","java","springboot");
		
		Map<String, Long> output1 = words.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("count :" + output1);
		//output.entrySet().stream().filter(emp -> emp.getValue()).collect(Collectors.toList());
 
	
	}
}
 