package practice;

public class rev_three {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		int j=2;
		if(a.length%3==0) {
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			a[i]=a[i+2];
			a[i+2]=temp;
			i+=2;
		}
		}
		int k=a.length%3;
		if(a.length%3!=0) {
			for(int i=0;i<a.length-k;i++) {
				int temp=a[i];
				a[i]=a[i+2];
				a[i+2]=temp;
				i+=2;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	
		

	}

}
