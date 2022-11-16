package Arrays;

import java.util.Scanner;

public class Delet_ele {
	
	public static int [] deletElement(int a[],int index) {
		if(index<0||index>a.length) {
			System.out.println("Inde is out of range");
			return a;
		}
		int c[] = new int [a.length-1];
		for(int i=0;i<c.length;i++) {
			if(i<index)
				c[i]=a[i];
			else
				c[i]=a[i+1]; 
			
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size= sc.nextInt();
		int p[]= new int [size];
		System.out.println("Enter the elements");
		for(int i=0;i<p.length;i++) {
			p[i]=sc.nextInt();
		}
		System.out.println("Enter the index of array which you want to remove");
		int index =sc.nextInt();
		int q[]=deletElement(p,index);
		System.out.println("After deleting the element");
		for(int i=0;i<q.length;i++) {
			System.out.println(q[i]);
		}
	}
}
