package clg_placement;

import java.util.Scanner;
import java.util.Arrays;

public class anagr_method {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		
		System.out.println("Enter string 1: ");
		String a=obj.nextLine();
		
		System.out.println("Enter string 2: ");
		String b=obj.nextLine();
		
		if(a.length()!=b.length()) {
			System.out.println("Anagram Not possible ");
		}
		else {
		
		char first[]=a.toCharArray();
		char second[]=b.toCharArray();
		
		   Arrays.sort(first);
		    Arrays.sort(second);
		    
		

//		
//		for(int i=0;i<a.length();i++) {
//			for(int j=0;j<a.length()-1-i;j++) {
//				if((int)(first[j])>((int)(first[j+1]))) {
//					char temp=first[j];
//					first[j]=first[j+1];
//					first[j+1]=temp;
//				}
//			}
//		}
//		
//		for(int i=0;i<a.length();i++) {
//			for(int j=0;j<a.length()-1-i;j++) {
//				if((int)(second[j])>((int)(second[j+1]))) {
//					char temp=second[j];
//					second[j]=second[j+1];
//					second[j+1]=temp;
//				}
//			}
//		}
		

	 
	//	int count=0;
		
//		for(int i=0;i<a.length();i++) {
//			if(first[i]==second[i]) {
//				count++;
//			}
//			
//		}
		
		
		
		if(Arrays.equals(first, second)) {
			System.out.println("Anagram possible");
		}
		else {
			System.out.println("Anagram not possible");

		}
	
		}
		
	}

}
