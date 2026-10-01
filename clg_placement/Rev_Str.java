package clg_placement;

import java.util.Scanner;

public class Rev_Str {

	public static void main(String[] args) {

	Scanner obj=new Scanner(System.in);
	
	System.out.println("enter the string : ");
	String n=obj.nextLine();
	
	String rev="";
	
	for(int i=n.length()-1;i>=0;i--) {
		rev+=n.charAt(i);
	}
	
	System.out.println("reversed :"+rev);
	
	}

}
