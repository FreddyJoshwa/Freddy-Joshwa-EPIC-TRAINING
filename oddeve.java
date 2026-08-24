package Task;
import java.util.*;
public class oddeve {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println(" enter the number ");
		int a=obj.nextInt();
		
		if(a%2==0) {
			System.out.println("even number ");
		}
		else {
			System.out.println("odd number ");
		}
	}

}
