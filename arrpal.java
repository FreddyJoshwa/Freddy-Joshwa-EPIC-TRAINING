package Task;

public class arrpal {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,2,1};
		int j=a.length-1;
		int b[]=new int[a.length];
		boolean check=true;
		
		for(int k=0;k<a.length;k++) {
			b[k]=a[k];
		}
		
		for (int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
			
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				check=false;
			}
		}
		
		if(check) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		
	}

}
