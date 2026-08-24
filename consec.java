import java.util.*;
public class consec {

	public static void main(String[] args) {

			Scanner obj=new Scanner (System.in);
			int a[]=new int[5];
			
			System.out.println(" enter 1 seq :");
			for(int i=0;i<a.length;i++) {
				a[i]=obj.nextInt();
			}
			int count=0;
			int maxi=0;
			
			for (int j=0;j<a.length;j++) {
				if(a[j]==1) {
					count+=1;
				}
				else {
					count=0;
					}
				if (count>maxi) {
					maxi=count;
				}
				
			
	}
			System.out.println(maxi);

}
}