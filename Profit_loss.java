package Task;
import java.util.*;
public class Profit_loss {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			
			System.out.println("enter your selling price :");
			int sp=obj.nextInt();
			
			System.out.println("enter the cost price :");
			int cp=obj.nextInt();
			
			int f=sp-cp;
			
			if(f<0) {
				System.out.println("loss");
			}
			else if(f>0) {
				System.out.println("Profit");
			}
			else {
				System.out.println("No Profit and No Loss");
			}
	}

}
