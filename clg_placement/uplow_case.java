package clg_placement;

import java.util.Scanner;

public class uplow_case {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the input : ");
		String inp=obj.nextLine();
		String outp="";
		for(int i=0;i<inp.length();i++) {
			if(((int)inp.charAt(i))<97){
				int samp=((int)inp.charAt(i)-64);
				int num=(samp%26)+97;
				outp+=((char)num);
			}
			else {
				int samp=((int)inp.charAt(i)-96);
				int num=(samp%26)+65;
				outp+=((char)num);
			}
		}
		System.out.println(outp);
	}

}
