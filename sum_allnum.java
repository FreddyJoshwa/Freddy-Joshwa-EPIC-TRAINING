package kite_day1;
import java.util.*;
public class sum_allnum {

	public static void main(String[] args) {
	Scanner obj =new Scanner(System.in);
	System.out.println("enter the number:");
	int a=obj.nextInt();
	int b=0;
	int sum=0;
	int c=0;
	while(a!=0) {
		b=a%10;
		sum+=b;
		a=a/10;
		
        
	}
	System.out.println("sum :"+sum);
	}

}
