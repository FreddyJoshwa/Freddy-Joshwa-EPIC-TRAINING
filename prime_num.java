package prep_day1;

import java.util.*;
public class prime_num {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner (System.in);
		System.out.print("enter the number : ");
		int a=obj.nextInt();
		int count=0;
		
		if(a==1 || a== 2) {
			System.out.println("Prime number ");
		}
		else {
			for(int i=1;i<a;i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("Prime number  ");
			}
			else {
				System.out.println("not a prime number  ");
			}
		}
	}

}
