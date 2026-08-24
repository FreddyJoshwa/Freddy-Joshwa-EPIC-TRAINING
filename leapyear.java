package Task;
import java.util.*;

public class leapyear {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("enter the year :");
			int a=obj.nextInt();
			
			if(a%400==0 || a%4==0 && a%100!=0) {
				System.out.println("leap year ");
				
			}
			else {
				System.out.println("not a leap year ");
			}
			
	}

}
