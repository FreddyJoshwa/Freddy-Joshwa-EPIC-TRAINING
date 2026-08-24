package prep_day1;

public class floyd_pattern {

	public static void main(String[] args) {
		int a=5;
		int t=1;
		for(int i=1;i<=a;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(t + " ");
				t++;
			}
			
			
			System.out.println();
		}

	}

}
