package practice;

public class rev_firsthalf {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60,70,80};
		
		for(int i=(a.length-1)/2;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		for(int i=((a.length-1)/2)+1;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
