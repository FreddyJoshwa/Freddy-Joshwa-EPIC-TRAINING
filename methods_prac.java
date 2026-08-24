package placement;

import java.util.*;
public class methods_prac {
	
	 static int rev(int a) {
		 int rev=0;
		 while(a!=0) {
		
		int b=a%10;
		rev=rev*10+b;
		a=a/10;
		 }
		 return rev;
	}
	 
	 static void palindrome(int a) {
		 int b=a;
		 int rev=0;
		 while(a!=0) {
			 int c=a%10;
			  rev=rev*10+c;
			 a=a/10;
		 }
		 if(rev==b) {
			 System.out.println("its palindrome ");
		 }
		 else {
			 System.out.println("not a palindrome");
		 }
	 }
	 
	 static void prime(int a) {
		 int count=0;
		 if(a==0 || a==1) {
			 System.out.println("prime number ");
		 }
		 else {
			 for(int i=1;i<a;i++) {
				 if(a%i==0) {
					 count++;
				 }
				 
			 }
			 if(count==1) {
				 System.out.println("primt number ");
			 }
			 else {
				 System.out.println("not a prime number ");
			 }
		 }
	 }
	 
	 static int fact(int a) {
		 int sol=1;
		 for(int i=1;i<=a;i++) {
			 sol*=i;
		 }
		 return sol;
	 }

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		System.out.print("enter the number to reverse : ");
		int a=obj.nextInt();
		int reve=rev(a);
		System.out.println("reversed : "+reve);
		
		System.out.println("enter number to check palindrome : ");
		int b=obj.nextInt();
		palindrome(b);
		
		System.out.println("enter the number to check prime : ");
		int c=obj.nextInt();
		prime(c);
		
		System.out.println("enter the number to factorial  : ");
		int d=obj.nextInt();
		int sol=fact(d);
		System.out.println(sol);
	}

}
