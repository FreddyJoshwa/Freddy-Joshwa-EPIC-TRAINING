package Task;

import java.util.*;

public class BMI_Calc {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter your weight (in kgs): ");
		double w=obj.nextDouble();
		
		System.out.println("enter your height (in meters)");
		double h=obj.nextDouble();
		
		double bmi=w/(h*h);
		
		if (bmi <18.5) {
			System.out.println("under weight ");
		}
		else if(bmi >18.5 && bmi<24.29) {
			System.out.println("normal weight ");
		}
		else if(bmi>25 && bmi<29.9) {
			System.out.println("over weight ");
		}
		else {
			System.out.println("obese");
		}
	}

}
