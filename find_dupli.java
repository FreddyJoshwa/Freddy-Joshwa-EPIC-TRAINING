package practice;

public class find_dupli {

	public static void main(String[] args) {
		int a[]= {1,3,4,2,1,4};
		
		for(int i=0;i<a.length;i++) {
			boolean found=false;
			for(int j=0;j<i;j++) {
				if(a[j]==a[i]) {
					found=true;
					System.out.print(a[j]+" ");
				}
			}
		}

	}

}
