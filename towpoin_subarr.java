import java.util.*;

public class towpoin_subarr {

	public static void main(String[] args) {
		Scanner obj=new Scanner(system.in);
		
		System.out.println("enter the array size : ");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		System.out.println("enter value k: ");
		int k=obj.nextInt();
		
		int sum=0;
		int j=0;
		int maxlength=0,length=0;
		int start=-1;
		int end=-1;
		
		for(int i=0;i<n;i++) {
			sum+=a[j];
			while(sum>k) {
				sum-=a[i];
				i++;
			}
			while(sum==k) {
			if(length>maxlength) {
				maxlength=length;
			}
			
		}
	}

}
}