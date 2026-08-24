import java.util.*;

public class rain_water {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in) ;
		
		int a[]= {1,2,3,4,5};
		int k=7;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]+a[i]==k) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
			
		}

	}

}
