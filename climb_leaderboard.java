package practice;

import java.util.Scanner;

public class climb_leaderboard {

	public static void main(String[] args) {
//		int lead[]= {100,100,50,40,40,20,10};
//		int scores[]= {5,25,50,120};
//		int j=0,elem=0;
//		int rank[]=new int[lead.length+1];
//		
//		for(int i=0;i<lead.length;i++) {
//			rank[i]=lead[i];
//		}
//		
//		rank[rank.length-1]=scores[0];
//		int ans=0;
//		
//		while(ans<=8) {
//			int p =1;
//			
//			int r=1;
//			for(int i=0;i<rank.length-1;i++) {
//				for(int k=0;k<rank.length-1-i;k++) {
//					if(rank[k]<rank[k+1]) {
//						int temp=rank[k];
//						rank[k]=rank[k+1];
//						rank[k+1]=temp;
//					}
//				}
//			}
//			
//			for(int i=0;i<rank.length;i++) {
//				if(rank[i]!=rank[p]) {
//					r++;
//					p++;
//					if(rank[i]==scores[j]) {
//						System.out.print(r);
//						break;
//					}
//				}
//				
//			}
//			
//			for(int i=0;i<rank.length;i++) {
//				if(rank[i]==scores[j]) {
//					rank[i]=scores[j+1];
//				}
//			}
//		
//			ans++;
//		}
//		
//
//	
	
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the size : ");
	int n1=obj.nextInt();
	int k=0;
	int a[]=new int[n1];
	System.out.println("enter the values : ");
	
	int scores[]= {5,25,50,120};
	
	for(int i=0;i<a.length;i++) {
		 int b=obj.nextInt();
		 boolean duplicate=false;
		for(int j=0;j<k;j++) {
			if(b==a[j]) {
				duplicate=true;
				break;
			}
		}
		if(!duplicate) {
			a[k]=b;
			k++;
		}
		
		
	}
	for(int j=0;j<scores.length;j++) {
	int r=1;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			
		if(scores[j]<a[i]) {
			r++;
		}
		else {
			
			break;
		}
		
		
		}
		
		
	}
	System.out.println(r);
	}
	
	
	}
	


}
