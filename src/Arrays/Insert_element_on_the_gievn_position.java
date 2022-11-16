package Arrays;

import java.util.Scanner;

public class Insert_element_on_the_gievn_position {
	public static int [] insertElement(int a[], int ele, int index) {
		if(index<0||index>a.length) {
			System.out.println("Index is not in range");
			return a;
		}
		int c [] =new int [a.length+1];
		c[index]=ele;
		for(int i=0;i<a.length;i++) {
			if(i<index) 
				c[i] =a[i];
			else 
				c[i+1]=a[i];
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size");
		int n =sc.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element Which want to insert");
		int ele =sc.nextInt();
		System.out.println("Enter the Position where you want to add the element");
		int index =sc.nextInt();
		//int a[]= {1,3,4,8,9};
		int p[] = insertElement(a,ele,index);
		System.out.println("After inserting new element");
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
	
}
}
