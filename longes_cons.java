
public class longes_cons {

	public static void main(String[] args) {

			int a[]= {100,150,300,450,750,600};
			int seq=2;
			int large=2;
			int diff=0;
			int c=a[1]-a[0];
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
			for(int i=1;i<a.length-1;i++) {
				diff=a[i+1]-a[i];
				
				if(diff==c) {
					
					seq++;
					if(seq>large) {
						large=seq;
					}
			
				}
				else {
					seq=2;
				}
				
				c=diff;
			}
			System.out.println(large);
			
	}

}
