package Task;
import java.util.*;
public class last_dup {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter array elements : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int i=n-1;i>=0;i--) {
			boolean found=false;
			for(int j=n-1;j>i;j--) {
				if(a[i]==a[j]) {
					System.out.print("last dupli " +a[i]);
					found=true;
					break;
					
				}
			}
			if(found) {
				break;
			}
		}
	}

}
