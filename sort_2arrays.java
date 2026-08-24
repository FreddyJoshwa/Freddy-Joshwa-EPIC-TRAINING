package Lcube_problems;

public class sort_2arrays {

	public static void main(String[] args) {
		
	int a[]= {9,5,3,6,4,1};
	int b[]= {4,8,6,7,9};
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}

	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b.length-i-1;j++) {
			if(b[j]>b[j+1]) {
				int temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
			}
		}
	}
	
	System.out.println("array 1 : ");
	for(int x:a) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("Array 2 : ");
	for(int x:b) {
		System.out.print(x+" ");
	}
	}

}
