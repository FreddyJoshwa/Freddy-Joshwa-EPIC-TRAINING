package Task;
import java.util.*;
public class CeltoFah {

	public static void main(String[] args) {

			Scanner obj =  new Scanner(System.in);
			float f=0;
			
			System.out.println("enter the celcius  :");
			float cel=obj.nextInt();
			
			f=(cel*9/5)+32;
			
			System.out.println("fahrenheit :"+f);
	}

}
