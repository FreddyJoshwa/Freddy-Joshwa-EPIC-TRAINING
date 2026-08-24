package practice;

public class merge_withoutdup {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,7,9};
		int b[]= {2,3,4,5,6,9};
		int n=a.length+b.length;
		
		int c[]=new int[n];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			 c[i+a.length]=b[i];
		}
		
		for(int i=0;i<n;i++) {
			boolean found=true;
			for(int j=0;j<i;j++) {
				if(c[j]!=c[i]) {
					found=false;
+9.63+25					System.out.print(c[j]+" ");
					
				}
			}
			
		}

	}

}
