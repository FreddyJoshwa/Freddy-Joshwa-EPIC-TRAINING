package clg_placement;

import java.util.Scanner;

public class operations {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);

		System.out.println("Enter the string  for operation : ");
		String a=obj.nextLine();
		
		int num=((int)(a.charAt(0)))-48;
		
		int j=(a.length()/2)+1;
		
		for(int i=1;i<=(a.length()/2);i++) {
			
				switch(a.charAt(j)) {
				case '-':
					num-=((int)(a.charAt(i))-48);
					break;
				case '+':
					num+=((int)(a.charAt(i))-48);
					break;
					
				case '*':
					num*=((int)(a.charAt(i))-48);
					break;
					
				case '/':
					num/=((int)(a.charAt(i))-48);
					break;
					
				case '%':
					num%=((int)(a.charAt(i))-48);
					break;
				} 
				j++;
			}
		System.out.println("Output :"+num);

		}
		
	}


