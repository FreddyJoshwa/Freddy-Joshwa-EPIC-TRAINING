package prep_day1;
import java.util.Scanner;

public class rem_dupl {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size  : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter array values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
System.out.print(a[i]);		}
		
		System.out.println("aft rem :");
		for(int j=0;j<n-1;j++) {
			
				if(a[j]!=a[j+1]) {
					System.out.print(a[j]+" ");
			}
			
		}
		System.out.print(a[n-1]);
	}

}
