package prep_day1;

import java.util.*;

public class avg_arr {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.print("enter the size of array  : ");
		int a=obj.nextInt();
		int sum=0;
		
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=obj.nextInt();
		}
		
		for(int i=0;i<a;i++) {
			sum+=b[i];
		}
		double avg=sum/a;
		
		System.out.println("avg : "+avg);
	}

}
