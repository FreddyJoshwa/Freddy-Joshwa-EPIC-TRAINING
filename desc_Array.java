package Lcube_problems;

public class desc_Array {

	public static void main(String[] args) {
		
		int a[]= {5,3,7,2,8,1,9};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int x:a) {
			System.out.print(x+" ");
		}

	}

}
