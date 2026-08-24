package Task;
import java.util.*;

public class Pos_left {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j]<0 && a[j+1]>0) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
