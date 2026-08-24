import java.util.*;
public class repetation {

	public static void main(String[] args) {
		
			int a[]= {100,4,200,1,3,2};
			int count=0;
			int b=0;
			int c=0;
			int maxi=0;
			for (int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					c=b;
					 b=a[i]-a[j];
					 
					 if(c==b) {
						 count+=1;
					 }
					 else {
							count=0;
							}
						if (count>maxi) {
							maxi=count;
						}
						
					 
					 
				}
			}System.out.println(maxi);
		}

	}


