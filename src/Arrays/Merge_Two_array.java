package Arrays;

import java.util.Scanner;

public class Merge_Two_array {
	public static int[] mergeArrays(int a[],int b[]) {
		int c [] = new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length] =b[i];
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int size_a =sc.nextInt();
		int a[] =new int[size_a];
		System.out.println("enter the "+size_a+" elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Display the elements in aray a");
		for(int i=0;i<a.length;i++) {
			System.out.println("Element on index "+i+" is "+a[i]);
		}
		System.out.println("Enter the size of 2nd array");
		int size_b =sc.nextInt();
		int b[] =new int[size_b];
		System.out.println("enter the "+size_b+" elements");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("Display the elements in aray b");
		for(int i=0;i<b.length;i++) { 
			System.out.println("Element on index "+i+" is "+b[i]);
		}
		int c [] =mergeArrays(a,b);
		System.out.println("after merging ");
		for(int i=0;i<c.length;i++) {
			System.out.println("Element on index "+i+" is "+c[i]);
		}
	}

}
