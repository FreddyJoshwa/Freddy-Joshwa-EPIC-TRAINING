package prep_day1;

public class bin_pattern {

	public static void main(String[] args) {
			
		int a=5;
		int b=1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				if(b==1) {
				System.out.print(b);
				b=0;
			}
				else {
					System.out.print(b);
					b=1;
				}
				
		}
			System.out.println();	
			}
		}

	}


