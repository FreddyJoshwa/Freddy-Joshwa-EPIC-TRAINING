import java.util.*;
public class charactercheck {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("enter the input ");
		char a=obj.next().charAt(0);
		
		if (Character.isAlphabetic(a)) {
			System.out.println("alphabet");
		}
		else {
			System.out.println("not a alphabet");
		}

	}

}
