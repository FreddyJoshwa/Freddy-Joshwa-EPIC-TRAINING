package Task;
import java.util.*;
public class Admission {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter your marks :");
		int m=obj.nextInt();
		
		System.out.println("enter your percentage");
		int per=obj.nextInt();
		
		if (m>=60 && m<=100) {
			if(per>75 && per<100) {
				System.out.println(" edigible for admission ");
			}
			else {
				System.out.println("not edigible");
			}
		}
		else {
			System.out.println("not edigible");
		}
	}

}
