package clg_placement;

import java.util.Scanner;

public class distint {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String wrd=obj.nextLine();
		
		int a[]=new int[26];
		
		for(int i=0;i<wrd.length();i++) {
			int temp=((int)(wrd.charAt(i)))-97;
			a[temp]++;
		}
		
		for(int i=0;i<wrd.length();i++) {
			int temp=((int)(wrd.charAt(i)))-97;
			if(a[temp]==1) {
				System.out.println((char)(temp+97)+" ");
			}
		}
	}

}
