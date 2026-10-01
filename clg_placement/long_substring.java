package clg_placement;

import java.util.Scanner;

public class long_substring {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("enter the string : ");//111010111
			String inp=obj.nextLine();
			int maxcount=0;
			int count=0;
			int one=0;
			int st=0,end=0;
			
			for(int i=0;i<inp.length();i++) {	
				one=0;
				count=0;
				for(int j=i;j<inp.length();j++) {
					if(inp.charAt(j)=='1') {
							one++;
					}
					else{
						one--;
					}
					count++;
					if(one==0) {
						if(count>maxcount) {
							maxcount=count;
							st=i;
							end=j;
							
						}
					}
					
				}
				
			}
			for(int i=st;i<=end;i++) {
			
			System.out.print(inp.charAt(i));
			}
			System.out.println();
			System.out.println("Maximun : "+maxcount);
	}

}
