import java.util.*;
public class identymatrix {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			int a[][]=new int[3][3];
			
			for (int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					a[i][j]=obj.nextInt();
				}
			}
			int found=0;
			
			for (int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					
						if(i==j) {
							if(a[i][j]==1) {
								found+=1;
						}
						
					}
						if(i!=j) {
							if(a[i][j]==0) {
								continue;
							}
							else if(a[i][j]>0) {
								found=0;
							}
						}
					
				}}
			
			if(found==3) {
				System.out.println("identical matrix ");
			}
			else {
				System.out.println("not identical matrix");
			}
			
	}

}
