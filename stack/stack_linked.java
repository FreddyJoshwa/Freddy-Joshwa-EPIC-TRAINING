package stack;

import java.util.Scanner;

class Stack_Node{
	int data;
	Stack_Node top=null,next=null;
	public Stack_Node(int data, Stack_Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	Stack_Node(){
		
	}
	public void push(Scanner obj) {
		System.out.println("Enter data : ");
		int val=obj.nextInt();
		Stack_Node obj1=new Stack_Node(val,top);
		top=obj1;
		System.out.println("Value inserted !");
	}
	
	public void pop() {
		top=top.next;
		System.out.println("value remooved !!");
	}
	
	public void display() {
		Stack_Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public boolean isEmpty() {
		if(top==null) {
			return true;
		}
		return false;
	}
	
	public void peek() {
		System.out.println("Peek data : "+top.data);
	}
	
}
public class stack_linked {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		Stack_Node obj1=new Stack_Node();
		
		while(true) {
			System.out.println("1)push \n2)pop \n3)display \n4)check empty \n5)peek");
			int n=obj.nextInt();
			switch(n) {
			case 1:
				obj1.push(obj);
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
