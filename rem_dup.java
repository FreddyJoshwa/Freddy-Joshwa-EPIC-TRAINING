package Lcube_problems;

public class rem_dup {

	public static void main(String[] args) {
		int a[]= {10,20,10,30,20,40,50};
		
		for(int i=0;i<a.length;i++) {
			boolean found =false;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					found=true;
					break;
				}
			}
			if(!found) {
				System.out.print(a[i]+" ");
			}
		}
	}

}
