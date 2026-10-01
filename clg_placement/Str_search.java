package clg_placement;

import java.util.Scanner;

public class Str_search {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("Enter the word : ");
			String w=obj.nextLine();
			
			
			System.out.println("enter letter  to search : ");
			char s=obj.next().charAt(0);
			
			for(int i=0;i<w.length();i++) {
				if(s==w.charAt(i)) {
					System.out.println("letter Found");
					break;
				}
			}
			
	}

}
