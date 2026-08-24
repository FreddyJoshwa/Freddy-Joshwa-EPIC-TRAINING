package practice;

public class train_unsorted {

	public static void main(String[] args) {
	

		int a[]= {900,940,950,1800,1500,1100}; // 900 905  920 909
		int d[]= {910,1200,1120,1130,1900,2000}; //910 915 930 940
		 int temp=1;
		for(int i=0;i<a.length;i++) {
			int count=1;
			
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					if(a[i]>=a[j] && a[i]<=d[j]) {
						count++;
					}
				}
			}
			if(count>temp) {
				temp=count;
			}
		}
		
		System.out.println("minimum platform  :"+temp);

	}

}
