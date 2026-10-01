package doublely.circular.linkedlist;

import java.util.Scanner;

class Node{
	
	int data,num=0;
	Node prev=null,next=null,head=null,tail=null;
	public Node(Node prev,int data,  Node next) {
		super();
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	Node(){
		
	}
	
	public void insert(Scanner obj) {
		System.out.println("Enter number of nodes : ");
		int n=obj.nextInt();
		num+=n;
		for(int i=0;i<n;i++) {
			System.out.println("Enter number of value :");
			int val=obj.nextInt();
			Node obj1=new Node(null,val,null);
			Node temp=head;
			if(head==null) {
				head=obj1;
			}
			else {
				tail.next=obj1;
				obj1.prev=tail;
			}
			tail=obj1;
			obj1.next=head;
			
		}
	}
	
	public void display() {
		Node temp=head;
		do {
			System.out.println(temp.data);
			temp=temp.next;
			
		}while(temp!=tail.next);
		
	}
	public void revdis() {
		Node temp=tail;
		do {
			System.out.println(temp.data);
			temp=temp.prev;
		}while(temp!=head.prev);
	}
	
	public void insmid(Scanner obj) {
		System.out.println("enter the position to insert : ");
		int pos=obj.nextInt();
		
		if(pos>num+1) {
			System.out.println("Invalid position ");
		}
		else {
			System.out.println("Enter the value :");
			int val=obj.nextInt();
			
			Node obj1=new Node(null,val,null);
			Node temp=head;
			if(pos==1) {
				head.prev=obj1;
				obj1.next=head;
				obj1.prev=tail;
				head=obj1;
				tail.next=head;
				num++;
			}
			else {
				if(pos==num) {
					obj1.next=tail.next;
					obj1.prev=tail;
					tail.next=obj1;
					tail=obj1;
					num++;
				}
				else {
				for(int i=0;i<pos-2;i++) {
					temp=temp.next;
				}
				obj1.prev=temp;
				obj1.next=temp.next;
				temp.next=obj1;
				obj1.next.prev=obj1;
				num++;
				}
				
			}
		}
	}
	
	
}

public class basics {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		Node obj2=new Node();
		
		while(true) {
			System.out.println("1)insert \n2)display \n3)Reversed display \n4)inserting middle");
			int n=obj.nextInt();
			switch(n) {
			case 1:
				obj2.insert(obj);
				break;
			case 2:
				obj2.display();
				break;
			case 3:
				obj2.revdis();
				break;
			case 4:
				obj2.insmid(obj);
				break;
			}
		}
	}

}
