package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	int id;
	String name;
	double cgpa;
	
	Student(int id ,String name,double cgpa){
		this.id =id;
		this.name = name;
		this.cgpa =cgpa;
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

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
}

public class StudentStreams {
	
	public static void main(String[] args) {
		List<Student> stuList = Arrays.asList(new Student(1,"Kani",7.85),
				new Student(2,"Nivi",7.5),
				new Student(3,"Ajay",8.0),
				new Student(4,"Swetha",7.25));
		
		//sort the students by cgpa
		List<Student> result = stuList.stream().sorted(Comparator.comparingDouble( s -> s.getCgpa())).collect(Collectors.toList());
		result.forEach(s -> {
			System.out.println(s.getName() + " " + s.getCgpa());
		});
	}
	
	

}
