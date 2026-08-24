package kite_day1;

import java.util.*;

public class majority_elem {

	public static void main(String[] args) {

		Scanner obj=new Scanner (System.in) ;
		
		System.out.println("enter the size of array : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		int count=0;
		int max=0;
		int num=0;
		System.out.println("enter the element  ");
		for (int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			num=a[i];
			if(num==a[i]) {
				count++;
			}
			if(count>n/2) {
				max=num;
				break;
			}
			
		}
		
		System.out.println("majority element is : "+max);
		
	}

}
