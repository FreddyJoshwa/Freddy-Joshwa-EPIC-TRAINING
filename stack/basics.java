package stack;

import java.util.Scanner;

class Stackimp{
	int top=-1;
	int n=10;
	int[] stack=new int[n];
	
	public void push() {
		Scanner obj=new Scanner(System.in);
		if(top>=n) {
			System.out.println("Stack overflow");
		}
		else {
		System.out.println("Enter value : ");
		int val=obj.nextInt();
		
		stack[++top]=val;	
		System.out.println("Value inserted !!");
		}
	}
	public void pop() {
		if(top<=-1) {
			System.out.println("Stack underflow");
		}
		else {
			System.out.println(stack[top]+" removed ");
			top--;
		}
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");

		}
		else {
			System.out.println("Peek :"+stack[top]);

		}
	}
	public void display() {
		if(top!=-1) {
		for(int i=top;i>=0;i--) {
			System.out.println(stack[i]);
		}
		}
		else {
			System.out.println("Stack is empty ");
		}
	}
}
public class basics {

	public static void main(String[] args) {
		Scanner obj2=new Scanner(System.in);
		
		Stackimp obj1=new Stackimp();
		
		while(true) {
			System.out.println("1)pushing values \n2)poping values \n3)displaying values \n4)Check empty \n5)peek element");
			int n=obj2.nextInt();
			switch(n) {
			case 1:
				obj1.push();
				break;
			case 2:
				obj1.pop();
				break;
			case 3:
				obj1.display();
				break;
			case 4:
				obj1.isEmpty();
				break;
			case 5:
				obj1.peek();
				break;
			}
		}
		
	}

}
