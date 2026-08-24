package practice;

public class missig_seq {

	public static void main(String[] args) {
		int a[]= {3,1,4,-1};
		int k=a[0];
		int ans=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[j]>0) {
				if(a[j+1]==a[i]) {
					continue;
			
				}
				else {
					k=a[j]+1;
					if(k<ans) {
						ans=k;
					}
				}
					
					
				}
			}
		}
		System.out.print("k : "+ans);

	}

}
