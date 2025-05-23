package Collections.sorting.UsingCustomComparators;

import java.util.Comparator;

import Collections.sorting.SortingWithComparableInterface.Student;

public class AscendingStudentComparatorIdBASED implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getId()-s2.getId();
	}
	

}
