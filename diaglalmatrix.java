import java.util.*;
public class diaglalmatrix {
	
	public static void main(String[] args) {

		Scanner obj=new Scanner (System.in);
		int a[][]=new int[3][3];
		
		System.out.println(" enter the matrix values : ");
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=obj.nextInt();			}
		}
		int sum=0;
		
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if (i==j) {
					sum+=a[i][j];
				}
			}
		
	}System.out.println("the sum of diagnol is  :"+sum);
}
}