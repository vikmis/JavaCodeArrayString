package Arrays.Sort;

import java.util.Arrays;
import java.util.Comparator;

public class sortArray_InbuitMethod {
	
	public static void main(String[] args) {
		 Person[] people = {
	                new Person("Alice", 30),
	                new Person("Bob", 25),
	                new Person("Charlie", 35)
	        };

	        // Sort by name (alphabetical order)
	        Arrays.sort(people, Comparator.comparing(p -> p.name));
	        System.out.println("Sorted by name: " + Arrays.toString(people));
	        // Output: Sorted by name: [Alice(30), Bob(25), Charlie(35)]

	        // Sort by age (numeric order)
	        Arrays.sort(people, Comparator.comparingInt(p -> p.age));
	        System.out.println("Sorted by age: " + Arrays.toString(people));
	        // Output: Sorted by age: [Bob(25), Alice(30), Charlie(35)]
	    }
	

}
