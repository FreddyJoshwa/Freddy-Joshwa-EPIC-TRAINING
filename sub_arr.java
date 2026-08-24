package kite_day1;

import java.util.*;
public class sub_arr {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the limit : ");
		int n=obj.nextInt();
		int sum=0;
		int large=0;
		int s=0;
		int e=0;
		int a[]=new int[n];
		System.out.print("enter array values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				
				for(int k=i;k<=j;k++) {
					
					System.out.print(a[k]+" ");
					sum+=a[k];
					if(sum>large) {
						large=sum;
						s=i;
						e=j;
					}
					
				}
				
				System.out.println("sum = "+sum);
				
				sum=0;
			}
			
		}System.out.println("Maximum sum :"+large);
		System.out.println("sub array : ");
		for(int i=s;i<=e;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
