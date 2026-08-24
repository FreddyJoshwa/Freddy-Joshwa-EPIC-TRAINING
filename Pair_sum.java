package Task;
import java.util.*;

public class Pair_sum {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter the array values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		System.out.println("Enter the target : ");
		int t=obj.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]+a[j]==t) {
					System.out.println(a[i]+"+"+a[j]);
				}
			}
		}
	}

}
