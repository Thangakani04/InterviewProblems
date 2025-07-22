package InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee22 {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;

    // Constructor
    public Employee22(int id, String name, String department, double salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString() method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}


public class StreamPreparation {
	
	public static void main(String[] args) {
		
		List<Employee22> employees = new ArrayList<>();

        employees.add(new Employee22(1, "Alice", "HR", 55000.0, 30));
        employees.add(new Employee22(2, "Bob", "IT", 75000.0, 28));
        employees.add(new Employee22(3, "Charlie", "Finance", 68000.0, 35));
        employees.add(new Employee22(4, "David", "IT", 80000.0, 25));
        employees.add(new Employee22(5, "Eva", "Sales", 62000.0, 32));
        employees.add(new Employee22(6, "Frank", "HR", 54000.0, 29));
        employees.add(new Employee22(7, "Grace", "IT", 90000.0, 40));
        employees.add(new Employee22(8, "Hannah", "Finance", 70000.0, 38));
        employees.add(new Employee22(9, "Ian", "Sales", 61000.0, 27));
        employees.add(new Employee22(10, "Jane", "Marketing", 58000.0, 26));
        
        //I need to group employees by department and sort the values based on salary in descending order
        
        Map<String,List<Employee22>> result = employees.stream()
        		.collect(Collectors.groupingBy(Employee22::getDepartment , Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().sorted(Comparator.comparingDouble(Employee22::getSalary).reversed()).limit(2).collect(Collectors.toList()))));
        System.out.println(result);
        
        double average = employees.stream().collect(Collectors.averagingDouble(Employee22::getSalary));
        System.out.println(average);
        
        List<String> sorted = employees.stream()
        		.sorted(Comparator.comparingDouble(Employee22::getSalary))
        		.map(emp -> emp.getName())
        		.collect(Collectors.toList());
        
        System.out.println(sorted);
        
        List<Employee22> sorted1 = employees.stream()
        		.sorted(Comparator.comparingDouble(Employee22::getSalary))
        		.collect(Collectors.toList());
        
        System.out.println(sorted1);
        
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> output = names.stream().collect(Collectors.collectingAndThen(Collectors.toList(), li -> li.subList(0, 2)));
        System.out.println(output);
        
        //Group employees by department and print average salary of each department
        Map<String,Double> out = employees.stream()
        		.collect(Collectors.groupingBy(emp -> emp.getDepartment() , Collectors.averagingDouble(Employee22::getSalary)));
        
        System.out.println(out);
        
        Map<String,Long> sum = employees.stream()
        		.collect(Collectors.groupingBy(
        				Employee22::getDepartment,Collectors.counting()));
        
        System.out.println(sum);
        
        //From a list of employees, group them by department and find the highest-paid employee
        //in each department.
        //Return a map with department as key and the highest-paid employee as value.
        
        Map<String,String> res = employees.stream()
        		.collect(Collectors.groupingBy(
        				Employee22::getDepartment ,
        				Collectors.collectingAndThen(
        						Collectors.maxBy(Comparator.comparingDouble(Employee22::getSalary)) ,
        						empout -> empout.map(Employee22::getName).orElse("Employee null"))));
        
       /* From the list of employees, group them by department, and for each department:

		Sort the employees by age (ascending)

		Collect all employee names in that order

		Return a Map<String, List<String>>, where:

			Key = Department

			Value = List of employee names sorted by age */
        Map<String,List<String>> output1 = employees.stream()
        		.collect(Collectors.groupingBy(Employee22::getDepartment , 
        				Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
        						.sorted(Comparator.comparingInt(Employee22::getAge).reversed()).map(Employee22::getName).collect(Collectors.toList()))));
        
        System.out.println(output1);
        
        /* Group them by department.

			In each department, filter only those employees whose salary is greater than ₹60,000.

			Collect the result as a Map<String, List<String>>, where:

			Key = Department name

			Value = List of employee names who earn more than ₹60,000, in that department. */
        
        Map<String,List<String>> output2 = employees.stream()
        		.collect(Collectors.groupingBy(Employee22::getDepartment , 
        				Collectors.collectingAndThen(Collectors.toList(), 
        						list -> list.stream().filter(emps -> emps.getSalary() > 60000).map(Employee22::getName)
        						.collect(Collectors.toList()))));
        System.out.println(output2);
        
        /* Group them by department

			Within each department, group by age

			For each age group in a department, collect employee names

			The final result should be:

			Map<String, Map<Integer, List<String>>> */
        
        Map<String , Map<Integer,List<String>>> output3 = employees.stream()
        		.collect(Collectors.groupingBy(Employee22::getDepartment , 
        				Collectors.groupingBy(Employee22::getAge , 
        						Collectors.collectingAndThen(Collectors.toList(),
        								list -> list.stream().sorted(Comparator.comparingInt(Employee22::getAge))
        								.map(Employee22::getName).collect(Collectors.toList())))));
              
        System.out.println(output3);
        
        Map<String , Map<Integer,List<String>>> output4 = employees.stream()
        		.collect(Collectors.groupingBy(Employee22::getDepartment , 
        				Collectors.groupingBy(Employee22::getAge , 
        						Collectors.mapping(Employee22::getName ,Collectors.toList()))));
        
        System.out.println(output4);


        
	}

}
