package kite_day1;
import java.util.*;

public class MergeArr {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the size of first array : ");
		int a1=obj.nextInt();
		
		int a[]=new int[a1];
		
		System.out.println("enter the array 1 values : ");
		for(int i=0;i<a1;i++) {
			a[i]=obj.nextInt();
		}
		
		System.out.println("enter the size of second array : ");
		int a2=obj.nextInt();
		
		int b[]=new int[a2];
		
		System.out.println("enter the array 2 values : ");
		for(int i=0;i<a2;i++) {
			b[i]=obj.nextInt();
		}
		int size=a1+a2;
		int c[]=new int[size];
		
		for(int i=0;i<a1;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<a2;i++) {
			c[i+a1]=b[i];
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(c[i]);
		}
		
	}

}
