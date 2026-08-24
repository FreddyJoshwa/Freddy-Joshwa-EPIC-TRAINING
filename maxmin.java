package Task;
import java.util.Scanner;
public class maxmin {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println(" enter the size of array :");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		int max=0;
		
		
		System.out.println("enter the values :");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int j=0;j<n;j++) {
			if(a[j]>max) {
				max=a[j];
			}
		}
		int min=a[0];
		
		for(int k=0;k<n;k++) {
			if(a[k]<min) {
				min=a[k];
			}
		}
		int diff=max-min;
		
		System.out.println("max "+max);
		System.out.println("min "+min);
		System.out.println("diff :"+diff);
	}

}
