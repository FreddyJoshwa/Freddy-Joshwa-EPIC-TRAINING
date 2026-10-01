package doublelinkedlist;

import java.util.Scanner;

class Node{
	Node prev=null;
	int data,n;
	Node next=null,head=null,tail=null;
	
	Node(Node prev,int data,Node next){
		this.prev=prev;
		this.data=data;
		this.next=next;
	}
	Node(){
		
	}
	
	public void insert(Scanner obj) {
		
		System.out.println("Enter the number of nodes : ");
		int n=obj.nextInt();
	
		for(int i=0;i<n;i++) {
			System.out.println("Enter the data : ");
			int val=obj.nextInt();
			
			Node obj1=new Node(prev,val,next);
			if(head==null) {
				head=obj1;
				
			}
			else {
				tail.next=obj1;
				obj1.prev=tail;
			}
			tail=obj1;
			
			
		}
	}
	
	public void display() {
		Node temp1=head;
		while(temp1!=null) {
			System.out.println(temp1.data);
			temp1=temp1.next;
		}
	}
	
	public void revprint() {
		Node temp1=tail;
		while(temp1!=null) {
			System.out.println(temp1.data);
			temp1=temp1.prev;
		}
	}
	
	public void midins(Scanner obj) {
		System.out.println("Enter the position to ins :");
		 n=obj.nextInt();
		System.out.println("Enter data : ");
		int val=obj.nextInt();
		Node obj1=new Node(null,val,null);
		Node temp=head;
		if(n==1) {
			obj1.next=head;
			head.prev=obj1;
			head=obj1;
		}
		else {
			for(int i=0;i<n-1;i++) {
				temp=temp.next;
			}
			if(temp==null) {
				tail.next=obj1;
				obj1.prev=tail;
				tail=obj1;
				
			}
			else {
				
				obj1.next=temp;
				obj1.prev=temp.prev;
				obj1.prev.next=obj1;
				temp.prev=obj1;
				
			}
			
			
			
		}
				
		
		
	}
	
	public void delete(Scanner obj) {
		System.out.println("Enter position to delete : ");
		int pos=obj.nextInt();
		Node temp=head;
		if(pos==1) {
			
			temp.next.prev=null;
			head=temp.next;
			
		}
		
		else {
			for(int i=0;i<pos-1;i++) {
				temp=temp.next;
			}
			if(temp.next==null) {
				tail.prev.next=null;
				tail=tail.prev;
			}
			else {
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
			}
			
		}
	}
}
public class basics {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
//
//		Node obj1=new Node(null,10,null);
//		Node head=obj1;
//		Node prev=obj1;
//		Node obj2=new Node(prev,20,null);
//		obj1.next=obj2;
//		prev=obj2;
//		Node obj3=new Node(prev,30,null);
//		obj2.next=obj3;
		
	
		Node obj1=new Node();
		
		while(true) {
			System.out.println("1)Insert nodes : \n 2)forward display : \n 3)Reverse display \n 4)Insert at middle \n 5)Delete node");
			int n=obj.nextInt();
			switch(n){
			case 1:
				obj1.insert(obj);
				break;
			case 2:
				obj1.display();
				break;
			case 3:
				obj1.revprint();
				break;
			case 4:
				obj1.midins(obj);
				break;
			case 5:
				obj1.delete(obj);
				break;
			}
		}
		
		
	}

}
