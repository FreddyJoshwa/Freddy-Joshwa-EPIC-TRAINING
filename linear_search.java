package Lcube_problems;

public class linear_search {

	public static void main(String[] args) {
		
		int a[]= {6,4,2,8,9,7};
		int s=8;
		for(int i=0;i<a.length;i++) {
			if(s==a[i]) {
				System.out.println("Element found at position : "+(i+1));
				break;
			}
		}
		

	}

}
