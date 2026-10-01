package circularqueue;

import java.util.Scanner;

class cir_que{
	int front=-1,rear=-1,n=4;
	int[] queue=new int[n];
	
	public void enqueue(Scanner obj) {
		if((rear+1)%n==front) {
			System.out.println("Queue Overflow ");
		}
		else{
			if(front==-1) {
			front=0;
		}
		System.out.println("Enter value :");
		
		queue[(++rear)%n]=obj.nextInt();
		
		}
	}
	public void display() {
		if(front==-1) {
			System.out.println("Queue is empty");
		}
		
	for(int i=front;i<(n+rear);i++) {
				System.out.println(queue[i%n]);
			}
	}
	
	public void dequeue() {
		if(front==-1) {
			System.out.println("Queue underflow");
		}
		else {
			System.out.println("value "+queue[front]+"Removed ");
			front++;
		
		}
	}

}
public class basics {

	public static void main(String[] args) {

		Scanner obj= new Scanner(System.in);
		cir_que obj1=new cir_que();
		while(true) {
			System.out.println("1)enque \n2)dequeue \n3)display");
			switch(obj.nextInt()) {
			case 1:
				obj1.enqueue(obj);
				break;
			case 2:
				obj1.dequeue();
				break;
			case 3:
				obj1.display();
				break;
				
			
			}
		}
		
	}

}
