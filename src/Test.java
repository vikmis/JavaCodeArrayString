import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Test {
	
	
	
	public static void main(String[] args) {
		List<String> fruiteList = Arrays.asList("Apple","Banana", "Orange","Apple","Banana", "Watermelon");
		
		
		fruiteList.stream().distinct().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		
		
		
		
		
	}

}
