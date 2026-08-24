import java.util.*;
public class rotation {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int k=0;
		System.out.println("enter the number to roatate");
		k=obj.nextInt();
		
		int a[]= {1,2,3,4,5,6};
		int index=0;
		
		int b[]= new int[6];
		 for (int i=0;i<k;i++) {
			 b[i]=a[i];
			 
			 }
		 for (int i=0;i<k;i++) {
			 a[i]=0;
			 
			 }
		 
		 for (int i=0;i<a.length-k;i++) {
			 a[i]=a[i+k];
			 }
		 
		for (int c=a.length-k;c<a.length;c++) {
			a[c]=b[index];
			index+=1;
		}
		 for (int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
			 }
		
	}

}
