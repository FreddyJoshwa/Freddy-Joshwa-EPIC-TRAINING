package Task;
import java.util.*;
public class Small3 {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("enter num1 :");
			int a =obj.nextInt();
			
			System.out.println("enter num2 :");
			int b =obj.nextInt();
			
			System.out.println("enter num3 :");
			int c =obj.nextInt();
			
			if(a<b) {
				if(a<c) {
					System.out.println(a+"is smaller");
				}
				else {
					System.out.println(c+"is smaller");
				}
			}
			else if (b<a) {
				if (b<c) {
					System.out.println(b +" is smaller");
				}
				else {
					System.out.println(c + "is smaller");
				}
			}
	}

}
