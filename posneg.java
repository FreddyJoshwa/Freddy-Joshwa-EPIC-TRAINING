import java.util.*;
public class posneg {

	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		
		System.out.println(" enter the number ");
		int a=obj.nextInt();
		
		if(a<0) {
			System.out.println("negative number ");
		}
		else if (a>0){
			System.out.println("postive number ");
		}
		else
		{
			System.out.println("zero");
		}
	}

}
