package Task;
import java.util.*;

public class Vote {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("enter your age :");
			int age=obj.nextInt();
			
			if (age<18) {
				System.out.println("not edigible to vote ");
			}
			else {
				System.out.println("edigible to vote ");
			}
			
	}

}
