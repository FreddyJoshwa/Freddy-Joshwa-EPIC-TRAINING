import java.util.*;
public class largenummatrix {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			int a[][]=new int[3][3];
			int large=0;
			int b=0;
			System.out.println("enter the values :");
			for (int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					a[i][j]=obj.nextInt();
				}
			}
			for (int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					b=a[i][j];
					if(b>large) {
						large=b;
					}
				}
			}
			System.out.println(large);
			
	}

}
