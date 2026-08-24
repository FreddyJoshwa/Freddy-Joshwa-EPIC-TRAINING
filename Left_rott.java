package prep_day1;

public class Left_rott {

	public static void main(String[] args) {
		
		int r=3;
		int a[]= {1,2,3,4,5};
		
		r=r% a.length;
		
		for(int i=1;i<=r;i++) {
			int val=a[a.length-1];
			for(int j=a.length-1;j>=1;j--) {
				a[j]=a[j-1];
				
			}
			a[0]=val;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
