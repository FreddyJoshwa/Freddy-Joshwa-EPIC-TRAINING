package Task;
import java.util.*;
public class Bill {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		double aft_dis=0;
		System.out.println("enter product 1 price  :");
		int pro1_pri=obj.nextInt();
		System.out.println("enter product1 quantity :");
		int pro1_q=obj.nextInt();
		
		System.out.println("enter product 2 price  :");
		int pro2_pri=obj.nextInt();
		System.out.println("enter product 2 quantity :");
		int pro2_q=obj.nextInt();
		
		System.out.println("enter product 3 price  :");
		int pro3_pri=obj.nextInt();
		System.out.println("enter product 3 quantity :");
		int pro3_q=obj.nextInt();
		
		int pro1=pro1_pri*pro1_q;
		int pro2=pro2_pri*pro2_q;
		int pro3=pro3_pri*pro3_q;
		
		double total=pro1+pro2+pro3;
		System.out.println("total bill : "+total);
		
		if (total>5000) {
			aft_dis=total-((total)* 10/100);
			System.out.println("bill after 10% discount : "+ aft_dis);
		}
		else {
			System.out.println("no discount ");
		}
	}

}
