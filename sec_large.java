package Lcube_problems;

public class sec_large {

	public static void main(String[] args) {
		
		int a[]= {20,45,30,90};
		
		int large=0,seclar=0,thlar=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>seclar && a[i]<large) {
				seclar=a[i];
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>thlar && a[i]<seclar) {
				thlar=a[i];
			}
		}
		
		
		
		System.out.println("large : "+large);
		System.out.println("sec large : "+seclar);
		System.out.println("third large : "+thlar);
	}

}
