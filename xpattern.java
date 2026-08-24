package Task;

public class xpattern {

	public static void main(String[] args) {

		int a=5;
		
		for(int i=0;i<=a;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=2*(a-i);j++) {
			if(j==0 || j==2*(a-i)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			}
			for(int v=0;v<=2*i-1;v++) {
				if (v==0 || v==2*i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
	}

}
