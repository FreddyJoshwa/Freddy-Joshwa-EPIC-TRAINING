package clg_placement;

public class biggernum {

	public static void main(String[] args) {
		
		int a[]= {5,15,10};
		int b=0;
		int c=0;
		for (int i=0;i<3;i++) {
			c=a[i]>b ? a[i]=b : a[i] ;
		}
System.out.println(b);
	}

}
