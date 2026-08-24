package Lcube_problems;

public class rev_arr {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7};
		int end=a.length-1,start=0;
		
		
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			end--;
			start++;
		}
		

		
		for(int x:a) {
			System.out.print(x+" ");
		}

	}

}
