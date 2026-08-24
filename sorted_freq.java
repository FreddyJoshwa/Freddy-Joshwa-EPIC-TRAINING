package Task;-

public class sorted_freq {

	public static void main(String[] args) {

		int a[]= {1,2,8,4-,2,8,1};*
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];/*
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		int count=1;
		for(int i=1;i<a.length;i++){
			if(a[i]==a[i-1]) {
				count++;
			}else {
				System.out.println(a[i-1]+" => "+count);
				count=1;
			}
			
		}/
		System.out.println(a[a.length-1]+" => "+count);
		
	}

}
*-//*--*-+*---*/-9*-+*-*/1qw1`	q212qwer1`12`341212*