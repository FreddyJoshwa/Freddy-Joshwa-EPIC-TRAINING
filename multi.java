package Task;
import java.util.*;

public class multi {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the number  :");
		int a=obj.nextInt();
		int ans=0;
		for(int i=0;i<=a;i++) {
			if(i%5==0) {
				ans+=i;
			}
		}
		System.out.println("sum of multiples of 5 is "+ans);

	}

}
