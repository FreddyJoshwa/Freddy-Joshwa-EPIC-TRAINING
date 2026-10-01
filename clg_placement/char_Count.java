package clg_placement;

import java.util.Scanner;

public class char_Count {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the word : ");
		String inp=obj.nextLine();
		
		int count=0;
		
		for(int i=0;i<inp.length();i++) {
			count++;
		}
		System.out.println("Character count :"+count);
	}

}
