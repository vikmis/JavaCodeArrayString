package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployeeBySalary {

	public static void main(String[] args) {
		
		
	List<Employee> employee = Arrays.asList(new Employee("john",100000),
			new Employee("Vikash",200000),
			new Employee("Akash",300000),
			new Employee("Goldi",400000),
			new Employee("Piyush",500000)		
			);
	
	List<Employee> highSalEmp = employee.stream().filter(emp->emp.getSal()>200000).collect(Collectors.toList());
	
	System.out.println("High Salary Employee >200000");
	
	System.out.println(highSalEmp);
	
	highSalEmp.forEach(System.out::println);
		
	}
}
