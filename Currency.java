package Task;
import java.util.*;
public class Currency {

	public static void main(String[] args) {

		Scanner obj=new Scanner (System.in);
		System.out.println("enter the amount :");
		int amt=obj.nextInt();
		
		int fiv_hun=0;
		int two_hun=0;
		int hun=0;
		int fift=0;
		int twen=0;
		int ten=0;
		int five=0;
		int two=0;
		int one=0;
		
		fiv_hun=amt/500;
		amt=amt-(fiv_hun*500);
		
		two_hun=amt/200;
		amt=amt-(two_hun*200);
		
		hun=amt/100;
		amt=amt-(hun*100);
		
		fift=amt/50;
		amt=amt-(fift*50);
		
		twen=amt/20;
		amt=amt-(twen*20);
		
		ten=amt/10;
		amt=amt-(ten*10);
		
		five=amt/5;
		amt=amt-(five*5);
		
		two=amt/2;
		amt=amt-(two*2);
		
		one=amt/1;
		amt=amt-(one*1);
		
		System.out.println("500 : "+fiv_hun);
		System.out.println("200 : "+two_hun);
		System.out.println("100 : "+hun);
		System.out.println("50 : "+fift);
		System.out.println("20 : "+twen);
		System.out.println("10 : "+ten);
		System.out.println("5 : "+five);
		System.out.println("2 : "+two);
		System.out.println("1 : "+one);
		
	}

}
