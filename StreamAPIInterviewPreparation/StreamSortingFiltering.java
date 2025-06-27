package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class EmpClass1 {
        int id;
        String name;
        int age;
        double salary;

  
        public EmpClass1(int id, String name, int age, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }    
    
        @Override
		public String toString() {
			return "EmpClass1 [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}

		public int getId() { return id; }
        public String getName() { return name; }
        public int getAge() { return age; }
        public double getSalary() { return salary; }
    }

public class StreamSortingFiltering {
	
	public static void main(String[] args) {
		List<EmpClass1> employees = Arrays.asList(
			    new EmpClass1(1, "Alice", 28, 70000),
			    new EmpClass1(2, "Bob", 35, 90000),
			    new EmpClass1(3, "Charlie", 32, 120000),
			    new EmpClass1(4, "David", 29, 85000),
			    new EmpClass1(5, "Eva", 45, 110000),
			    new EmpClass1(6, "Frank", 31, 105000),
			    new EmpClass1(7, "Grace", 38, 95000)
			);
		
		List<String> output = employees.stream()
				.filter(emp -> emp.getAge() >= 30)
				.sorted(Comparator.comparingDouble(EmpClass1::getSalary).reversed())
				.map(emp -> emp.getName())
				.limit(3)
				.toList();
		
		System.out.println("Output " + output);
		
		
		// If e1.getAge() > e2.getAge() → return 1

		// If e1.getAge() < e2.getAge() → return -1

		// If equal → return 0
		
		List<EmpClass1> output1 = employees.stream()
				.sorted((e1,e2) -> e1.getAge() > e2.getAge() ? 1 : e1.getAge() < e2.getAge() ? -1 : 0)
				.collect(Collectors.toList());
		
		System.out.println("Output1 " + output1);
				
	}

}
