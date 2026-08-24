package Task;
import java.util.*;
public class counter {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the counter value : ");
			int counter=obj.nextInt();
			for(int i=1;i<=5;i++) {
				counter++;
			}
			for (int j=1;j<=3;j++) {
				counter--;
			}
			System.out.println("counter :" + counter);
	}

}
