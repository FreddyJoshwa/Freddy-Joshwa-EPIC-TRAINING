package clg_placement;

import java.util.Scanner;

public class lett_Count {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		int a[]=new int[26];
		
		System.out.println("enter the text : ");
		String wrd=obj.nextLine();
		
	  for(int i=0;i<wrd.length();i++) {
			
			if((char)(wrd.charAt(i))>96) {
			int temp=((int)(wrd.charAt(i)))-97;
			a[temp]++;
			}
			else {
				int temp=((int)(wrd.charAt(i)))-65;
				a[temp]++;
			}
		}
		
		for(int i=0;i<wrd.length();i++) {
			
			int temp=0;
			if((char)(wrd.charAt(i))>96) {
			 temp=((int)(wrd.charAt(i)))-97;
			}
			else {
			  temp=((int)(wrd.charAt(i)))-65;

			}
			if(a[temp]>0) {
				System.out.println(wrd.charAt(i)+": "+a[temp]);
			}
			if(a[temp]>1) {
				a[temp]=0;
			}
			
		}

	}

}
