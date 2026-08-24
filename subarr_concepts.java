package practice;

public class subarr_concepts {

	public static void main(String[] args) {

		int a[]= {1,2,3,4};
		int sum=0;
//		for(int x:a) {
//			System.out.println(x);
//		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				for(int k=i;k<=j;k++) {
					
					sum+=a[k];
				}
					for(int k=i;k<=j;k++) {
						if(sum%2==0) {
							System.out.print(a[k]+" ");
						}
					}
					
				
				
				System.out.println();
				sum=0;
			}
		}
		
		

//			for(int i=0;i<a.length-2;i++) {
//				for(int j=i;j<=i+2;j++) {
//					System.out.print(a[j]+" ");
//				}
//				System.out.println();
//			}
		
		
		
//		int subarrcount=a.length*(a.length+1)/2;
//		System.out.println("subb arr count : "+subarrcount);
		
	}

}
