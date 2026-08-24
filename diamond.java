package patterns;

public class diamond {

	public static void main(String[] args) {


		int a=5;
		for(int i=1;i<=a;i++) {
			for(int k=0;k<=a-i-1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
		}
		
		for(int i=1;i<=a;i++) {
			for(int k=0;k<=i-2;k++) {
				System.out.print(" ");
			}
			for(int j=a;j>=i;j--) {
				System.out.print("* ");
			}System.out.println();
		}
	}

}
