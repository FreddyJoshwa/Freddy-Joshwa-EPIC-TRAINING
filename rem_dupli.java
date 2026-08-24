package kite_day1;

import java.util.Scanner;

public class rem_dupli {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.print("enter the size  :");
			int a=obj.nextInt();
			
			int b[]=new int[a];
			
			for (int i=0;i<a;i++) {
				b[i]=obj.nextInt();
			}
			
			for(int i=0;i<a;i++) {
				boolean found=false;
				int j=0;
				while(j<i) {
					if(b[i]==b[j]) {
						found=true;
						break;
						
					}
					j++;
				}
				if(!found) {
					System.out.println(b[i]+" ");
					
				}
			}
	}

}
