package Task;

public class Partition {

	public static void main(String[] args) {
		int a[]= {23,-42,36,14,-18,-31};
		
		int left=0 ,right=a.length-1;
		
		while(left < right) {
			while(left< right && a[left] <0 ) {
				left++;
			}
			while(left < right && a[right]>=0) {
				right--;
			}
			
			if(left < right) {
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
