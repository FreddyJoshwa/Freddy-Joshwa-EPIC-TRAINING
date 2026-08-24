package Task;
import java.util.*;

public class Even_left {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the size of array : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter array values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		int left=0;
		int right =n-1;
//		int k=0,l=0;
//		for(int i=0;i<n;i++) {
//			if(a[i]%2==0) {
//				a[k]=a[i];
//				k++;
//			}
//		}
//		for(int i=k;i<n;i++) {
//			if(a[i]%2!=0) {
//				a[k+l]=a[i];
//				l++;
//			}
//		}
		while(left<right) {
			while(left<right && a[left]%2==0) {
				left++;
			}
			while(left<right && a[right]%2!=0) {
				right--;
			}
			
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	
		
	}

}
