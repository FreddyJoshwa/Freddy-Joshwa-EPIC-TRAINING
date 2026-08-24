package practice;

public class partition_withoutchange {

	public static void main(String[] args) {

		int a[]= {4,7,-2,5,-7,1,8,-3};
		int k=0;
		
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				b[k]=a[i];
				k++;
			}
			
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				b[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
	}

}
