package Rough;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteElementFromGivenIndex {
	
	
	public static int [] deleteEle(int [] arr ,int index) {
		
		if(arr.length<index  &&  arr.length>index)  {
			
			
			System.out.println("Array out of bond execption");
		}
		
		int [] c = new int[arr.length-1];
		
		for(int i=0;i<c.length;i++) {
			
			if(i<index) {
				c[i]=arr[i];
			}else {
				c[i]=arr[i+1];
			}
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int index = 5;
		int result[]=deleteEle(arr,index);
		
		System.out.println(Arrays.toString(result));
		
	}

}
