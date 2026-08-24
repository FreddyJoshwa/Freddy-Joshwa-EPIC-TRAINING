package kite_day1;
import java.util.Scanner;
public class SumFact {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the number : ");
		int a=obj.nextInt();
		int b=0;
		int fact=1;
		int sum=0;
		
		while(a!=0) {
			b=a%10;
			for(int i=1;i<=b;i++) {
				fact=fact*i;
			}
			sum+=fact;
			fact=1;
			a=a/10;
		}
		System.out.println("sum of factorial :"+ sum);
		
	}

}
