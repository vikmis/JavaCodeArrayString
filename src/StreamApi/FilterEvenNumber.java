package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {
	
	public static void main(String[] args) {
		
		List<Integer> number =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> evenNumber = number.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Original Number :"+ number);
		System.out.println("Even NUmbers :"+evenNumber);
		
		for(int list : evenNumber) {
			System.out.println(list);
		}
		
	}

}

