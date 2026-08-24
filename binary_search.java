package Lcube_problems;

public class binary_search {

	public static void main(String[] args) {
		int a[]= {1,4,5,6,2,7,9};
		int s=6;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int x:a) {
			System.out.print(x+" ");
		}
		int low=0,high=a.length-1;

		while(low <= high) {
			
			int k=(low+high)/2;
			
			if(a[k]==s) {
				System.out.println("element found at index : "+k );
				break;
			}
			else if(s<a[k]) {
				high=k-1;
			}
			else {
				low=k+1;
			}
		}

	}

}
