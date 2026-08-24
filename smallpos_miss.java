package practice;

import java.util.Scanner;

public class smallpos_miss {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter array size : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter array values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		int g=0,res=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>g) {
				g=a[i];

			}
		
		}
		int l=g;
		for(int i=0;i<a.length;i++){
			if(a[i]>0) {
				if(a[i]<l)
				l=a[i];
				
			}
		}
		
		for(int i=l;i<=g;i++) {
			boolean found=false;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					found=true;
					break;
				}
			}
			if(!found) {
				if(i>0) {
					res=i;
					break;
				}
				

			}
		}
		System.out.println("missing num : "+res);
		
		

	}

}
