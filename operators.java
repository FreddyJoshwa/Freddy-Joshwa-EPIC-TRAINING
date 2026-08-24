
public class operators {

	public static void main(String[] args) {

			int a[]= {15,20,25,5,50};
			int max=0;
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<i;j++) {
					max= a[i]>a[j] ? a[i] :a[j];
				}
			}
			
			System.out.println(max);
			
			
			
			
			
	}

}
