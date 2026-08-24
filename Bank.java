package Practise_console;

import java.util.Scanner;

class Account{
	int cusId;
	String cusName;
	int bal;
	Account accArr[]=new Account[100];
	int index=0;
	
	
	Account(){
		
	}

	 Account(String name,int bal,int index) {
		this.cusName=name;
		this.bal=bal;
		this.cusId=index;
	}
	
	
	void createUser() {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your name : ");
		String name=obj.nextLine();
		
		System.out.println("enter your initial balance : ");
		int bal=obj.nextInt();
		
		Account acc=new Account(name,bal,index);
		
		accArr[index]=acc;
		index++;
		
		System.out.println("user created Succesfully");
	}
	
	void display() {
		for(int i=0;i<index;i++) {
			System.out.println(accArr[i].cusName);
			System.out.println(accArr[i].bal);
			System.out.println(accArr[i].cusId);
		}
		
		System.out.println("displayed information ");
	}
	

	
}

class Transaction{
	int cusId;
	int amount;
	String type;
	
	Transaction(){
		
	}
		Transaction(int amount,String type,int ac){
			this.amount=amount;
			this.type=type;
			this.cusId=ac;
		}
		void deposit(Account acc) {
			Scanner obj=new Scanner(System.in);
			System.out.println("enter deposit amount : ");
			int deposit = obj.nextInt();
			System.out.println("enter customer id : ");
			int ac=obj.nextInt();
			Transaction tr=new Transaction(deposit,"deposit",ac);
			acc.accArr[ac].bal+=deposit;
			
			
		}
		
		void withdrew(Account acc) {
			Scanner obj=new Scanner(System.in);
			System.out.println("enter Withdrew amount : ");
			int withdrew = obj.nextInt();
			
			System.out.println("enter cusid: ");
			int ac=obj.nextInt();
			
			Transaction tr=new Transaction(withdrew,"withdrew",ac);
			acc.accArr[ac].bal-=withdrew;
			
		}
	
}

public class Bank {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		Account acc=new Account();
		Transaction tr=new Transaction();
		
	while(true) {
		System.out.println("\n1) user creation \n 2)Display user  \n3)deposit amount  \n4)withdrew amt ");
		int n=obj.nextInt();
		switch(n) {
		case 1:
			acc.createUser();
			break;
		case 2:
			acc.display();
			break;
		case 3:
			tr.deposit(acc);
			break;
		case 4:
			tr.withdrew(acc);
			break;
		}
	}

	}

}
