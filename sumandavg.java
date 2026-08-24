package Task;

import java.util.Scanner;
public class sumandavg {
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int sum=0;
		int avg;
		System.out.println("enter the size of array : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter the values :");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		for(int j=0;j<n;j++) {
			sum+=a[j];
		}
		avg=sum/n;
		
		System.out.println("sum of array : "+ sum);
		System.out.println("avg of array : "+ avg);
	}

}
