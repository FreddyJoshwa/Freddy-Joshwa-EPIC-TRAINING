package Task;

import java.util.*;

public class first_dup {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the size of array : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter array elements : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		int dup=0;
		for(int i=0;i<n;i++) {
			boolean found=false;
			for(int j=0;j<i;j++) {
				if(a[j]==a[i]) {
					System.out.println("first dupli : "+a[i]);
					found=true;
					break;
				}
				
			
			}
			if(found) {
				break;
			}
			
		}
		
	}

}
