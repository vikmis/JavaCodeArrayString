package Collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_Lists_Primitive_Types {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(123,23,45,1);
		
		List<Integer> listAl = new ArrayList<Integer>(list);
		
		Collections.sort(listAl);
		System.out.println(listAl);

	}
}
