package Problems;
public class Employee {
 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
 
	private final int id;
	private final String name;
	private int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
 
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
 
	// Getter methods for age, gender, etc., can be added if needed
	public int getAge() {
		return age;
	}
 
	public String getGender() {
		return gender;
	}
 
	public String getDepartment() {
		return department;
	}
 
	public int getYearOfJoining() {
		return yearOfJoining;
	}
 
	public double getSalary() {
		return salary;
	}
 
	public int getId() {
		return id;
	}
 
	public String getName() {
		return name;
	}
}
 