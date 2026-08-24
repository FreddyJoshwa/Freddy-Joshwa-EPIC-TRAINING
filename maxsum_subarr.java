package practice;

public class maxsum_subarr {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,1};
		int k=5;
		
		int sum=0,length=0,maxlen=0,start=-1,end=-1,j=0;
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			while(sum>k) {
				sum-=a[j];
				j++;
			}
			if(sum==k) {
				length=i-j+1;
				if(length>maxlen) {
					maxlen=length;
					start=j;
					end=i;
				}
			}
			
		}System.out.println("max length : "+ maxlen);
		if(start!=-1) {
			for(int i=start;i<=end;i++) {
				System.out.print(a[i] + " ");
			}
			
		}
		else {
			System.out.println("no sub array ");
		}

	}

}
