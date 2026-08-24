package Task;

import java.util.*;

public class Watch {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("enter the seconds :");
		int a=obj.nextInt();
		int hrs=0;
		int mins=0;
		int secs=0;
		
		hrs=a/3600;
		a=a-(hrs*3600);
		mins=a/60;
		a=a-(mins*60);
		secs=a;
		
		System.out.println(hrs);
		System.out.println(mins);
		System.out.println(secs);
		
	}

}
