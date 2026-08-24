package practice;

public class check_sorted {

	public static void main(String[] args) {
		
		int a[]= {1,5,3,4,9,6,8};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		int k=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			if(b[k]==a[i]) {
				k++;
			}
		}
		
		
		if(k==a.length) {
			System.out.println("sorted array  ");
		}
		else {
			System.out.println("unsorted array ");
		}

	}

}
