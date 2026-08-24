import java.util.*;
public class kandens_algorithm {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the size");
		int n=obj.nextInt();
		int a[]=new int[n];
		
		System.out.println("enter values : ");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		int currsum=a[0];
		int maxsum=a[0];
		
		for(int i=1;i<n;i++) {
			if(currsum+a[i] >a[i]) {
				currsum+=a[i];
			}
			else {
				currsum=a[i];
			}
			if(currsum>maxsum) {
				maxsum=currsum;
			}
		}
		System.out.println("cuurent sum : "+currsum);
		System.out.println("max sum : "+maxsum);

	}

}
