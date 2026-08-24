package practice;

public class move_zero {

	public static void main(String[] args) {
		int a[]= {1,0,0,5,0,9};
		int k=0;
		for(int i=0;i<a.length;i++) {
				if(a[i]!=0) {
					a[k]=a[i];
					k++;
				}
			}
		while(k<a.length) {
			a[k]=0;
			k++;
		}
		
		for(int x:a) {
			System.out.print(x+" ");
		}
	}

}
