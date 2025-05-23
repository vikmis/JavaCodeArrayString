package Collections.sorting.SortingWithComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
	
	public static void main(String[] args) {
		
		List<Student> listAl= new ArrayList<>();
		
		listAl.add(new Student(103,"Alice"));
		listAl.add(new Student(101,"Bob"));
		listAl.add(new Student(102,"Charlie"));
		
		System.out.println("Original List :");
		for(Student s : listAl) {
			System.out.println(s);
		}
		System.out.println("using list.sort will automatically sort in natural order");
		
		listAl.sort(null);
		for(Student s : listAl) {
			System.out.println(s);
		}
		
		Collections.sort(listAl);
		System.out.println("\nSorted by ID (natural ordering): ");
		
		for(Student s : listAl) {
			System.out.println(s);
		}
		
	}

}
