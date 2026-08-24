package prep_day1;

public class longest_cons {

	public static void main(String[] args) {
		int a[]= {100,500,400,200,300,45,50,1};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		int diff=0;
		int c=a[1]-a[0];
		int count=2;
		int large=2;
		for(int i=1;i<a.length-1;i++) {
			diff=a[i+1]-a[i];
			if(diff==c) {
				count+=1;
				if(count>large) {
					large=count;
				}
			}
			else {
				count=2;
			}
			c=diff;
			
		}
		System.out.print("largest : "+large);

	}

}
