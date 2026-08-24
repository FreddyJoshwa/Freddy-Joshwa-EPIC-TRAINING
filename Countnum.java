package Task;
import java.util.Scanner;

public class Countnum {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the number : ");
		int a=obj.nextInt();
		int b=0;
		int count=0;
		int c=0;
		while(a!=0) {
			b=a%10;
			c=c*10+b;
			count=count+1;
			a=a/10;
			
		}
		System.out.println(" number of numbers : "+count);
		
		
	}

}
