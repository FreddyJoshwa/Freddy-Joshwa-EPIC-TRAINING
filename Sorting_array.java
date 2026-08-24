package kite_day1;

import java.util.Scanner;

public class Sorting_array {

	public static void main (String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter size of array :");
		int n=obj.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter the array values :");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j]%2!=0 && a[j+1]%2!=0) {
					if(a[j]>a[j+1]) {
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j]%2==0 && a[j+1]%2==0) {
					if(a[j]<a[j+1]) {
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
		}
		
		System.out.println("Sorted values: ");
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
			
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
			
		}
	}
}
