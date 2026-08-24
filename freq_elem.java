package Task;
import java.util.*;
public class freq_elem {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the array size :");
		int n=obj.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter array values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		

		
		for(int i=0;i<a.length;i++) {
			boolean found=false;
			for(int j=0;j<i;j++) {
			if(a[j]==a[i]) {
				found=true;
				break;
			}
			}
			if(found) {
				continue;
			}
			
			int count=0;
			for(int k=0;k<a.length;k++) {
			if(a[k]==a[i]) {
				count++;
			}
			}
			System.out.println(a[i]+" = "+count);
			
		}
	}

}
