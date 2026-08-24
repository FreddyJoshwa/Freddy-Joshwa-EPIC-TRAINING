package Lcube_problems;

public class pyramid {

	public static void main(String[] args) {
		int s=5;
		
		for(int i=0;i<s;i++) {
			for(int k=0;k<=(s/2)-i+1;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
