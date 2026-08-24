package Lcube_problems;

public class merge_sorted {

	public static void main(String[] args) {
		
		int a[]= {10,30,50,60};
		int b[]= {20,40,45,70};
		
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
		
		for(int i=0;i<(a.length+b.length);i++) {
			for(int j=0;j<(a.length+b.length)-i-1;j++) {
				if(c[j]>c[j+1]) {
					int temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		for(int x:c) {
			System.out.print(x+" ");
		}

	}

}
