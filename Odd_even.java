package kite_day1;
import java.util.*;

public class Odd_even {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println(" enter the number:");
		int a=obj.nextInt();
		int b=0;
		int odd=0;
		int even=0;
		
		while(a!=0) {
			b=a%10;
			if(b%2==0) {
				even+=1;
			}
			else {
				odd+=1;
			}
			
			a=a/10;
		
			
		}
System.out.println("oddnum:"+odd);
System.out.println("evennum:"+even);
	}

}
