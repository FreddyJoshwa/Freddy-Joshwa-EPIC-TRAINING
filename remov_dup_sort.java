package practice;

public class remov_dup_sort {

	public static void main(String[] args) {
		
		int a[]= {5,3,4,5,2,1,2,1};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	
//		for(int i=0;i<a.length;i++) {
//			boolean found=false;
//			for(int j=0;j<i;j++) {
//				if(a[i]==a[j]) {
//					found=true;
//					break;
//				}
//			}
//			if(!found) {
//				System.out.print(a[i]+" ");
//			}
//			
//		}
//		int k=1;
//		for(int i=1;i<a.length;i++) {
//		if(a[i]!=a[k-1]) {
//			a[k]=a[i];
//			k++;
//			
//		}
//		
//		}
//		for(int i=0;i<k;i++) {
//			System.out.print(a[i]+" ");
//		}
	

	}

}
