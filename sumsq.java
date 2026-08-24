package Task;
import java.util.*;
public class sumsq {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		
		System.out.println("enter the number :");
		int a=obj.nextInt();
		int sumsq=0;
		for(int i=0;i<=a;i++) {
			sumsq+=i*i;
		}
		System.out.println("sum of squares  :"+sumsq);
	}

}
