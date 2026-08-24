package Lcube_problems;

public class movezero {

	public static void main(String[] args) {
		int a[]= {0,10,0,20,30,0,40};
		int k=0;
		
		for(int i=0;i<a.length;i++) {

			if(a[i]!=0) {
				a[k]=a[i];
				a[i]=0;
				k++;
			}
			
		}
			
	
		
		for(int x:a) {
			System.out.print(x+" ");
		}

	}

}
