package practice;

public class even_odd_sum {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int p=0;
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0) {
				p+=a[i];
			}
			if(i%2!=0) {
				n+=a[i];
			}
		}
		System.out.println("even idex sum: "+p);
		System.out.println("odd index sum:"+n);
	}

}
