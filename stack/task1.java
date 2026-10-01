package stack;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);

		char [] stackalpha=new char[10];
		int altop=-1;
		char [] stacknotalpha=new char[10];
		int ntop=-1;
		
		System.out.println("input : ");
		String n=obj.next();
		
		for(int i=0;i<n.length();i++) {
			if((((int)n.charAt(i)) >=97 && ((int)n.charAt(i)) <=122)|| (((int)n.charAt(i)) >=65 && ((int)n.charAt(i)) <=90)) {
				altop++;
				stackalpha[altop]=n.charAt(i);
			}
			else {
			    ntop++;
				stacknotalpha[ntop]=n.charAt(i);
			}
		}
		
		for(int i=altop;i>=0;i--) {
			System.out.print(stackalpha[i]);
		}
		System.out.println();
		for(int i=ntop;i>=0;i--) {
			System.out.print(stacknotalpha[i]);
		}
		

	}

}
