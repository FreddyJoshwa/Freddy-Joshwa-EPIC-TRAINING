package Task;
import java.util.*;

public class pos_front {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println(" enter the size : ");
		int n=obj.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		int front=0;
		int back=n-1;
		while(front<back) {
			while(front<back && a[front]>0) {
				front++;
			}
			while(front < back && a[back]<0) {
				back--;
			}
			
			int temp=a[front];
			a[front]=a[back];
			a[back]=temp;
					
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
