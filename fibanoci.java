package prep_day1;

import java.util.*;

public class fibanoci {

	public static void main(String[] args) {

		Scanner obj=new Scanner (System.in);
		
		System.out.println("enter the number  : ");
		int a=obj.nextInt();
		int b=0;
		int c=1;
		for(int i=1;i<=a;i++) {
			
			System.out.print(b+" ");
			int d = b+c;
			b=c;
			c=d;
		}
	}

}
 