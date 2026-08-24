package practice;

public class product_of_array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int s=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]!=a[j]) {
					s=s*a[j];
				}
			}
			System.out.print(s+" ");
			s=1;
		}
		

	}

}
