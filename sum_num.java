package prep_day1;

import java.util.*;
public class sum_num {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.print("enter the number : ");
		int a=obj.nextInt();
		int c=a;
		int rev=0,b=0;
		while(a!=0) {
			b=a%10;
			rev=rev*10+b;
			a=a/10;
			
		}
		System.out.println("rev numbers : "+rev);
		if(rev==c) {
			System.out.println("Palindrome ");
		}
		else {
			System.out.println("not a palindrome ");
		}
	}

}
