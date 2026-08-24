package Task;
import java.util.Scanner;
public class count {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.print("enter the size of array :");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		int poscou=0;
		int negcou=0;
		int zerocou=0;
		
		System.out.print("enter the value :");
		for(int i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		
		for(int j=0;j<n;j++) {
			if (a[j]>0) {
				poscou+=1;
			}
			else if(a[j]<0) {
				negcou+=1;
			}
			else {
				zerocou+=1;
			}
		}
		
		System.out.println("positive numbers : "+poscou);
		System.out.println("negative numbers : "+negcou);
		System.out.println("zero count :"+zerocou);
			
	}

}
