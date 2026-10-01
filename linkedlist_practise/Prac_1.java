package linkedlist_practise;

import java.util.Scanner;
class Node{
	int data;
	Node address;
	Node head=null;
	Node prev=null;
	public Node(int data, Node address) {
		this.data = data;
		this.address = address;
	}
	Node(){
		
	}
	public void insert() {
		Scanner inp=new Scanner(System.in);
		
		System.out.println("enter number of nodes: ");
		int n=inp.nextInt();
	
		
		System.out.println("enter values :");
		for(int i=0;i<n;i++) {
			int temp=inp.nextInt();
			Node obj=new Node(temp,null);
			if(head==null) {
				head=obj;
				prev=obj;
			}
			else {
				prev.address=obj;
				prev=obj;
			}
		}
		
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.address;
		}
	}
	
	public void insnode() {
		Scanner inp=new Scanner(System.in);
		System.out.println("enter the position :");
		int pos=inp.nextInt();
		System.out.println("Enter value :");
		int val=inp.nextInt();
		Node obj=new Node(val,null);
		Node temp=head;
		if(pos==1) {
			obj.address=head;
			head=obj;
		}
		else{
		
		
		for(int i=0;i<pos-2;i++) {
			temp=temp.address;
		}
		if(temp.address==null) {
			prev=obj;
		}
		obj.address=temp.address;
		temp.address=obj;
		System.out.println(prev.data);
		}
	}
	
	
	
}
public class Prac_1 {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		Node obj=new Node();
		obj.insert();
		obj.display();
		obj.insnode();
		obj.display();
	}

}
