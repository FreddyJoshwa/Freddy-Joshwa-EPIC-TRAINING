package queue;

import java.util.Scanner;

class que{
	int rear=-1,front=-1,n=6;
	int[] queue=new int[n];
	
	public void enQueue(Scanner obj) {
		if(rear==n-1) {
			System.out.println("Stack overflow");
		}
		else {
			if(front==-1) {
				front=0;
			}
			System.out.println("Enter the value : ");
			queue[++rear]=obj.nextInt();
		}
	}
	
	public void display() {
		if(front==-1) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.println(queue[i]);
			}
		}
	
	}
	
	public void dequeue() {
		if(front==-1) {
			System.out.println("Queue underflow");
		}
		else {
			System.out.println("value "+queue[front]+"Removed ");
			front++;
			if(front>rear) {
				front=-1;
				rear=-1;
			}
		}
	}
	public void peek() {
		if(front==-1) {
			System.out.println("Queue is empty no peek element...!");
		}
		else {
			System.out.println(queue[front]);
		}
		
	}
	
	
}
public class basix {
 public static void main(String[] args) {
	
	 Scanner obj=new Scanner(System.in);
	 que obj1=new que();
	 while(true) {
		 System.out.println("1)enqueue \n2)display \n3)dequeue \n4)peek");
		 switch(obj.nextInt()) {
		 case 1:
			 obj1.enQueue(obj);
			 break;
		 case 2:
			 obj1.display();
			 break;
		 case 3:
			 obj1.dequeue();
			 break;
		 case 4:
			 obj1.peek();
			 break;
		 }
	 }
}
}
