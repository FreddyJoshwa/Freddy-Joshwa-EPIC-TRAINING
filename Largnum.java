package Task;
import java.util.*;
public class Largnum {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("enter num 1 :");
			int a=obj.nextInt();
			
			System.out.println("enter num 2 :");
			int b=obj.nextInt();
			
			if(a>b) {
				System.out.println(" greatest is " + a);
			}
			else {
				System.out.println(" greatest is "+ b);
			}
	}

}
