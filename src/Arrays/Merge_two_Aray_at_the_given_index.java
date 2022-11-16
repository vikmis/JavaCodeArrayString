package Arrays;

import java.util.Scanner;

public class Merge_two_Aray_at_the_given_index {
	public static int []MergeTwoArray(int a[],int b[],int index){
		if(index<0||index>a.length) {
			System.out.println("index is out of range");
			return a;
		}
		int c[] = new int[a.length+b.length];
		for(int i=0;i<b.length;i++) {
			c[index+i]=b[i];
		}
		for(int i=0;i<a.length;i++) {
			if(i<index) {
				c[i] =a[i];
			}else {
				c[i+b.length]=a[i];
			}
		}
		return c;
	}
	public static void main(String[] args) {
	int a[] = {2,5,6,3,8};
	int b[] = {1,9,10,4,7};
	int ar[]=MergeTwoArray(a,b,2);
	for(int i =0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
	
		
	}

}
