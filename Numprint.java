package Task;
import java.util.*;

public class Numprint {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in) ;
			
			System.out.println("enter the number :");
			int a=obj.nextInt();
			
			for(int i=1;i<=a;i++) {
				if(i%3==0 && i%5!=0) {
					System.out.println("fizz");
				}
				else if(i%5==0 && i%3!=0) {
					System.out.println("buzz");
				}
				else if(i%5==0 && i%3==0) {
					System.out.println("fizzbuzz");
				}
				else {
					System.out.println(i);
				}
			}
		
	}

}
