	package kite_day1;
import java.util.Scanner;

public class right_rotation {

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
			int val=a[n-1];
		for(int i=1;i<=n-1;i++) {
			a[n-i]=a[n-i-1];
			
		}
		a[0]=val;
		}
		System.out.println("array : ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
}
	}