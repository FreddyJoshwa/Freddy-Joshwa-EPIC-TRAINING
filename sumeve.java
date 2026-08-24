package Task;
import java.util.*;

public class sumeve {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			System.out.println("enter the number  :");
			int a=obj.nextInt();
			int evesum=0;
			for (int i=0;i<=a;i++) {
				if(i%2==0) {
					evesum+=i;
				}
			}
			System.out.println("sum of even numbers is :"+evesum);
	
	}

}
