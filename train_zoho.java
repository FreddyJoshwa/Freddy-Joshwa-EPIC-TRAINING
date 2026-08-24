package practice;

public class train_zoho {

	public static void main(String[] args) {
		int a[]= {900,940,950,1800,1500,1100}; // 900 905  920 909
		int d[]= {910,1200,1120,1130,1900,2000}; //910 915 930 940
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<d.length-1;i++) {
			for(int j=0;j<d.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		int plat=0;
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<=d[i-1]) {
				plat++;
			}
			else {
				plat+=0;
			}
		}
		
		System.out.print("platform : "+plat);
		
		
				


	}

}
