package clg_placement;

import java.util.Scanner;

public class nextalpha {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String inp=obj.nextLine();
		
		String output="";
		for(int i=0;i<inp.length();i++) {
			
		int samp=((int)inp.charAt(i))-96;
		int val=(samp%26)+97;
		output+=((char)val);
		
		}
		
		System.out.println(output);
		
	}

}
