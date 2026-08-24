package kite_day1;

import java.util.*;
public class rem_zero {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.print("Enter the number : ");
			int a=obj.nextInt();
			
			while(a%10==0) {
				a=a/10;
			}
			
			System.out.print(a);
		
	}

}
