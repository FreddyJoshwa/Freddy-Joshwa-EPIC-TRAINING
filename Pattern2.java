package Task;

import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the rows : ");
		int a=obj.nextInt();
		
		for (int i=1;i<=a;i++) {
			for(int k=1;k<=a-i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
