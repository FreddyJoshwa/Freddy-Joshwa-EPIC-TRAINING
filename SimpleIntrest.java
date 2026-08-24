package Task;
import java.util.*;

public class SimpleIntrest {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("enter principle amount  :");
			int p=obj.nextInt();
			
			System.out.println("enter rate of intrest :");
			int r=obj.nextInt();
			
			System.out.print("enter the time (in years) : ");
			int t=obj.nextInt();
			
			float si=(p*r*t)/100;
			
			System.out.println("simple intrest is "+si);
	
	}

}
