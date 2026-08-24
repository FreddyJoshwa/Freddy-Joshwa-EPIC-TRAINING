package Task;

public class Pattern3 {

	public static void main(String[] args) {

			int a=5;
			
			for(int i=1;i<=a;i++) {
				for(int k=1;k<=a-i;k++) {
					System.out.print(" ");
				
				}
				for(int j=1;j<=(2*i)-1;j++) {
					if (j==1 || j==2*i-1 ||i==a) {
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
