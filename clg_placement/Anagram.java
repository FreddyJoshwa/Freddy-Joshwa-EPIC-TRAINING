package clg_placement;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter String 1 :");
		String a=obj.nextLine();
		
		int arr[]=new int[26];
		
		System.out.println("Enter String 2 :");
		String b=obj.nextLine();
		
		if(a.length()!=b.length()) {
			System.out.println("Anagram is not possible");
		}
		else {
		for(int i=0;i<a.length();i++) {
			int temp=((char)(a.charAt(i)))-97;
			int temp1=((char)(b.charAt(i)))-97;
			arr[temp]++;
			arr[temp1]++;
		}
		int count=0;
		for(int i=0;i<a.length();i++) {
			int temp=((int)(a.charAt(i)))-97;
			if(arr[temp]!=0  && arr[temp]%2==0 ) {
				count++;
			}
		}
		
		if(count==a.length()) {
			System.out.println("Anagram is possible");
		}
		else {
			System.out.println("Not possible");
		}
		}
	}

}
