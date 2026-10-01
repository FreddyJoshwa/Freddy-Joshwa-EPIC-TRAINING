package clg_placement;

import java.util.Scanner;

class Node{
	int data;
	Node address;
	Node head=null;
	
	public Node(int data, Node address,Node head) {
		this.data = data;
		this.address = address;
		this.head=head;
	}
	
	public Node() {
		
	}
	
	public void insert() {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number of data : ");
		int n=obj.nextInt();
		
		Node prev=null;
		
		for(int i=0;i<n;i++) {
			int val=obj.nextInt();
			Node ob=new Node(val,null,null);
			if(head==null) {
				head=ob;
				prev=ob;
			}
			else {
				prev.address=ob;
				prev=ob;
			}
		}
		
	}
	
	public void display() {
		System.out.println("Datas in linked list :");
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.address;
		}
		
	}
	
}
public class Linked_list {
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);

		Node t1=new Node();
		t1.insert();
		t1.display();
		
		
	}	
}
