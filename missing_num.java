package kite_day1;

import java.util.Scanner;
public class missing_num {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the number  :");
		int num=obj.nextInt();
		
		System.out.println("enter the size of array  :");
		int size=obj.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("enter the values : ");
		for(int i=0;i<size;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int i=1;i<num;i++) {
			boolean found=false;
			for(int j=0;j<=size-1;j++) {
				if(a[j]==i) {
					found=true;
					break;
				}
				
				
			}if(!found) {
				System.out.println(i);
			}
		}
	}

}
