package practice;

public class third_largest {

	public static void main(String[] args) {

		int a[]= {12,34,67,23,56};
		int max=0;
		int sec_lar=0;
		int third_lar=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
		}
			if(a[i]>sec_lar && a[i]<max) {
				sec_lar=a[i];
			}
			
			
			
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>third_lar && a[i]<sec_lar) {
				third_lar=a[i];
			}
		}
		System.out.println("sec large"+sec_lar);
		System.out.println(" large"+max);
		System.out.println("third large : "+third_lar);
	}

}
