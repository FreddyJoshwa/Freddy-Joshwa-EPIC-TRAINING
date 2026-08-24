package Task;
import java.util.*;

public class Grade_cal {

	public static void main(String[] args) {

			Scanner obj=new Scanner(System.in);
			 System.out.println("enter the overall  marks of exam :");
			 double tot=obj.nextDouble();
			 
			 System.out.println("enter the marks you scored : ");
			 double score=obj.nextDouble();
			 
			 double per=score/tot *(100);
			 
			 System.out.println("percentage :"+per);
			 if (per>80) {
				 System.out.println("A Grade");
			 }
			 else if (per>=60 && per<80){
				 System.out.println("B Grade");
			 }
			 else if(per>=50 && per<60) {
				 System.out.println("C Grade");
			 }
			 else if(per>=40 && per<50) {
				 System.out.println("D Grade");
			 }
			 else {
				 System.out.println("F");
			 }
	}

}
