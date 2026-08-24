import java.util.*;

public class swapwithoutv {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			int a=0;
			int b=0;
			
			System.out.println("enter value a :");
			a=obj.nextInt();
			
			System.out.println("enter value b ");
			b=obj.nextInt();
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("value of a is :"+a);
			System.out.println("value of b is : "+b);
					
			
					
	}

}
