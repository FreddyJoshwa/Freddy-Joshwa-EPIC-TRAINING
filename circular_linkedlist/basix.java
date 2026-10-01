package circular_linkedlist;

import java.util.Scanner;

class Node{
	Node address,head=null,prev=null;
	int data,num=0;
	public Node(int data,Node address ) {
		super();
		this.data = data;
		this.address = address;
	}
	Node(){
		
	}
	
	public void insert(Scanner obj) {
		System.out.println("Enter number of nodes : ");
		int no=obj.nextInt();
		num+=no;
		for(int i=0;i<no;i++) {
			System.out.println("Enter the value :");
			int val=obj.nextInt();
			Node obj1=new Node(val,null);
			if(head==null) {
				head=obj1;
			}
			else {
				prev.address=obj1;
			}
			prev=obj1;
		}
		if(prev.address==null) {
			prev.address=head;
		}
System.out.println("Total nodes :"+num);

	}
   public void display() {
	   System.out.println("Values are : ");
	   Node temp=head;
//	   while(true) {
//		   System.out.println(temp.data);
//		   if(temp.address==head) {
//			   break;
//		   }
//		   temp=temp.address;
//	   }
	   
	   do {
		   System.out.println(temp.data);
		   temp=temp.address;
		   
	   }while(temp!=head);
	   System.out.println("Total nodes :"+num);
 
   }
   public void insmiddle(Scanner obj) {
	   System.out.println("Enter the position :");
	   int n=obj.nextInt();
	   if(n>num+1) {
		   System.out.println("Invalid input ");
	   }
	   else {
		   num++;
	   System.out.println("Enter value : ");
	   int val=obj.nextInt();
	   Node obj2=new Node(val,null);
	   if(n==1) {
		   obj2.address=head;
		   head=obj2;
		   prev.address=head;
	   }
	   else {
		   if(n==num) {
			   prev.address=obj2;
			   prev=obj2;
			   prev.address=head;
			  
			   
		   }
		   else {
			   Node temp=head;
			   for(int i=0;i<n-2;i++) {
				   temp=temp.address;
			   }
			   obj2.address=temp.address;
			   temp.address=obj2;
		   }
	   }
	   }
   }
   
   public void delete(Scanner obj) {
	   System.out.println("Enter position to delete : ");
	   int pos=obj.nextInt();
	   if(pos>num) {
		   System.out.println("Invalid input ");
	   }
	   else {
		   num--;
	   if(pos==1) {
		   head=head.address;
		   prev.address=head;
	   }
	   else {
		   Node temp=head;
		   for(int i=0;i<pos-2;i++) {
			   temp=temp.address;
		   }
		   if(temp.address==prev) {
			   temp.address=head;
			   prev=temp;
		   }
		   else {
		   temp.address=temp.address.address;
		   }
	   }
	   }
   }
}
public class basix {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		Node obj2=new Node();
		while(true) {
			
			System.out.println("1)insert nodes \n2)display nodes \n3)insert at middle \n4)delete node");
			int n=obj.nextInt();
			switch(n) {
			case 1:
				obj2.insert(obj);
				break;
			case 2:
				obj2.display();
				break;
			case 3:
				obj2.insmiddle(obj);
				break;
			case 4:
				obj2.delete(obj);
				break;
			}
			
		}
		
		
	}

}
