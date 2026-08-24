package Task;
import java.util.*;

public class Odd_front {

	public static void main(String[] args) {

		Scanner obj=new Scanner (System.in);
		
		System.out.println("enter the size of array : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter the array values : ");
		
		for(int i=0;i<a.length;i++) {
			a[i]=obj.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]%2==0 && a[j+1]%2!=0) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
