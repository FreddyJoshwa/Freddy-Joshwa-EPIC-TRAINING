package kite_day1;
import java.util.*;

public class left_rotate {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("enter the size of array :");
			int n=obj.nextInt();
			
			int a[]=new int[n];
			
			System.out.println(" enter the rotation value : ");
			int k=obj.nextInt();
			
			System.out.println("enter array : ");
			for(int i=0;i<n;i++) {
				a[i]=obj.nextInt();
			}
			
			if(k>n) {
				k=k%n;
			}
			
			
			for(int j=1;j<=k;j++) {
				int val=a[0];
			for(int i=0;i<n-1;i++) {
				a[i]=a[i+1];
				
			}
			a[n-1]=val;
			}
			System.out.println("array : ");
			for(int i=0;i<n;i++) {
				System.out.println(a[i]);
			}
	}

}
