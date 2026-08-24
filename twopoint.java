package Task;

public class twopoint {

	public static void main(String[] args) {

		int a[]= {2,-5,3,-7,7,8};
		
		int left=0 ,right=a.length-1;
		
		while(left<right) {
			while(left<right && a[left]<0) {
				left++;
			}
			
			while(left<right && a[right]>=0) {
				right--;
			}
			
			if(left<right) {
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
		
		for(int x:a) {
			System.out.println(x);
		}
	}

}
