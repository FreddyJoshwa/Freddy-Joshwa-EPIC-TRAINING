package prep_day1;
import java.util.*;

public class fact {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println(" enter the number : ");
		int a=obj.nextInt();
		int sol=1;
		for(int i=1;i<=a;i++) {
			sol*=i;
		}
		System.out.println("factorial : "+sol);
	}

}
