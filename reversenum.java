package Task;
import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number :");
		int a = obj.nextInt();
		int rev=0;
		int b=0;
		
		while(a!=0) {
		b=a % 10;
		rev=rev*10+b;
		a=a/10;
		
		}
		System.out.println("rev :"+rev);
		
	}

}
