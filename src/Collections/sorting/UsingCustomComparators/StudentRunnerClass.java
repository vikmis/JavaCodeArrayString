package Collections.sorting.UsingCustomComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Collections.sorting.SortingWithComparableInterface.Student;

public class StudentRunnerClass {
	
public static void main(String[] args) {
		
		List<Student> listAl= new ArrayList<>();
		
		listAl.add(new Student(103,"Alice"));
		listAl.add(new Student(101,"Bob"));
		listAl.add(new Student(102,"Charlie"));
		
		System.out.println("Original List :");
		for(Student s : listAl) {
			System.out.println(s);
		}
		
		System.out.println("*************************************************************");
		System.out.println();
		
		System.out.println("Sort By id using list.sort");
		
		listAl.sort(new AscendingStudentComparatorIdBASED());
		for(Student s : listAl) {
			System.out.println(s);
		}
		
		System.out.println();
		
		Collections.sort(listAl,new AscendingStudentComparatorIdBASED());
		System.out.println("Sort By id using Collections.sort" );
		
		for(Student s : listAl) {
			System.out.println(s);
		}
		
		System.out.println("*************************************************************");
		System.out.println();	                     
		
		System.out.println("Sort By name using list.sort");
		
		listAl.sort(new  NameBasedComparator());
		for(Student s : listAl) {
			System.out.println(s);
		}
		
		System.out.println();	
		
		Collections.sort(listAl,new NameBasedComparator());
		System.out.println("Sort By name using Collections.sort" );
		
		for(Student s : listAl) {
			System.out.println(s);
		}
		
}

}
