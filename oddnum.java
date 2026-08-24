package Task;
import java.util.*;
public class oddnum {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter the number :");
		int a=obj.nextInt();
		int oddcount=0;
		for(int i=0;i<=a;i++) {
			if(i%2!=0) {
				oddcount++;
			}
		}
		System.out.println(" ODD Count is "+oddcount);
	}

}
