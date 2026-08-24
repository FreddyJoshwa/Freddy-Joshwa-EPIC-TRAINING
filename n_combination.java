

import java.util.*;
public class n_combination {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the limit : ");
		int n=obj.nextInt();
		int count=n*(n+1)/2;
		
		System.out.println("combination count :"+count);
	}

}

