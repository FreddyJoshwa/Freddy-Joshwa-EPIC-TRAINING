package Task;
import java.util.*;
public class salbonus {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("enter your Experience :");
			int a=obj.nextInt();
			
			System.out.println("enter your salary");
			int b=obj.nextInt();
			
			if(a>=5 && b<50000) {
				System.out.println("edigible for bonus ");
			}
			else {
				System.out.println("not edigible ");
			}
	}

}
