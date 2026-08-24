import java.util.*;
public class matrixadd {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);

			int a[][]=new int[3][3];
			
			System.out.println("enter the values  :");
			for (int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					a[i][j]=obj.nextInt();
				}
			}
			
			System.out.println("the values are   :");
			for (int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(a[i][j]+" ");;
				}
				System.out.println();
			}
			int sum=0;
			for (int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					sum+=a[i][j];
				}
			
	}
			System.out.println(sum);

}}
