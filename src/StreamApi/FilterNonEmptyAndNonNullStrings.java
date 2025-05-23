package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNonEmptyAndNonNullStrings {
	
	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("hello","",null,"world","java");
		List<String> validStrings = strings.stream().filter(str-> str!=null && !str.trim().isEmpty()).collect(Collectors.toList());
		
        System.out.println("Original: " + strings);
        System.out.println("Valid Strings: " + validStrings);

		
	}
	
	


}
