package Lcube_problems;

public class freq {

	public static void main(String[] args) {
		int a[]= {1,2,1,3,2,1};
		int b=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			boolean found=false;	
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					found=true;
					break;
				}
			}
			if(found) {
				continue;
			}
			for(int k=0;k<a.length;k++) {
				if(a[i]==a[k]) {
					count++;
				}
			}
			System.out.println(a[i]+" "+count);
			count=0;
		}

	}

}
