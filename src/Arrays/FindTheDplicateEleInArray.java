package Arrays;

import java.util.HashSet;
import java.util.Set;

/*Find the Duplicate element in array 
for Example {1,4,6,7,8,9,4,5,9 ,7}
print {4,7,9}*/

public class FindTheDplicateEleInArray {
	
	public static void main(String[] args) {
		int ar[] = {1,4,6,7,8,3,4,3};
		
		Set<Integer> uniqueNumber = new HashSet<Integer>() ;
			
			for(int num : ar) {
				if(uniqueNumber.contains(num)) {
				System.out.println("Duplicate Element : "+num);
				}
				else {
					uniqueNumber.add(num);
				}
			}
			
			System.out.println(uniqueNumber);
		}
	}


