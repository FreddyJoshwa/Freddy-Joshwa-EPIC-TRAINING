import java.util.Scanner;
public class subarray_sum {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the limit : ");
		int n=obj.nextInt();
		int b=0;
		int a[]=new int[n];
		System.out.print("enter array values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		int max=0;
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				for(int k=i;k<=j;k++) {
			          
					System.out.print("["+a[k]+"]"+" ");
					b+=a[k];
					if(b>max) {
						max=b;
					}
				}
				
				System.out.println("sum = "+b);
				b=0;
			}
				
			
		}
		System.out.println("max sum : "+max);
	}

}
