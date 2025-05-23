package StreamApi.Map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transform_Numbers_to_Their_Squares {
	
	public static void main(String[] args) {
		
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
         List<Integer> squre = numbers.stream().map(n->n*n).collect(Collectors.toList());
         
         System.out.println(squre);
        
	}

}
