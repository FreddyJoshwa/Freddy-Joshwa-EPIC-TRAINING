package Task;

import java.util.*;
public class passfail {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("Python Mark :");
			int a=obj.nextInt();
			
			System.out.println("Java Mark :");
			int b=obj.nextInt();
			
			System.out.println("C++ Mark :");
			int c=obj.nextInt();
			
			if (a>=35 && b>=35 && c>=35 ) {
				System.out.println("Pass ");
			}
			else {
				System.out.println("Fail ");
			}
			 
			
	}

}
