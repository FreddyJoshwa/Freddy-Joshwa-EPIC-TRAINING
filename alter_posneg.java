package practice;

import java.util.Scanner;

public class alter_posneg {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		int a[]= {1,2,3,-4,-1,4};
		int b[]=new int[a.length];
		int pos=0,neg=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				pos++;
			}
			else {
				neg++;
			}
		}
		
		int p[]=new int[pos];
		int n[]=new int[neg];
		int k=0,l=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				p[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				n[l]=a[i];
				l++;
			}
		}
		int m=0,r=0,f=0,pi=pos-1,ni=neg-1;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				if(i<=pi) {
					b[m]=p[f];
					m++;
					f++;
				}
				else {
					b[m]=n[r];
					m++;
					r++;
				}
			}
			else {
				if(i<=ni) {
					b[m]=n[r];
					m++;
					r++;
				}
				else {
					b[m]=p[f];
					m++;
					f++;
				}
			}
			
		}
		
		for (int x:b) {
			System.out.print(x+" ");
		}
		
		

	}

}
