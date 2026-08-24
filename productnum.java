package kite_day1;
import java.util.*;
public class productnum {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number :");
		int a=obj.nextInt();
		int b=0;
		int product=1;
	    while(a!=0) {
	    	b=a%10;
	    	product=product*b;
	    	a=a/10;
	    	
	    }
        System.out.println("product of num :"+ product);
	}

}
