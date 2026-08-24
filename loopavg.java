package Task;
import java.util.*;
public class loopavg {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("enter the number :");
			int a=obj.nextInt();
			double sum=0;
			double avg;
			for (int i=0;i<=a;i++) {
				sum+=i;
				
			}
			avg=sum/a;
			System.out.println("sum :"+sum);
			System.out.println(" average of number is :"+avg);
	}

}
