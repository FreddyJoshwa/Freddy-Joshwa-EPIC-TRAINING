package clg_placement;

import java.util.Scanner;

public class space_str {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String n=obj.nextLine();
		
		String sp="";
		for(int i=0;i<n.length();i++) {
			sp+=n.charAt(i)+" ";
		}
		
		System.out.println(sp);
	}

}
