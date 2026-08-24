package Task;

import java.util.*;
public class Mark {

	public static void main(String[] args) {
			
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter mark 1 : ");
		int a=obj.nextInt();
		
		System.out.println("Enter mark 2 : ");
		int b=obj.nextInt();
		
		System.out.println("Enter mark 3 : ");
		int c=obj.nextInt();
		
		System.out.println("Enter mark 4 : ");
		int d=obj.nextInt();
		
		System.out.println("Enter mark 5 : ");
		int e=obj.nextInt();
		
		double total=a+b+c+d+e;
		double avg=total/5;
		double per=(total/500)*100;
		
		System.out.println("average :"+avg);
		System.out.println("percentage :"+per);
		
		if (per>=40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
