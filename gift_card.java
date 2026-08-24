
package console_application;

import java.util.Scanner;

class Customer{
	int cusId;
	String cusName;
	float accBalance;
	Customer cusArr[]=new Customer[100];
	int index=0;
	Customer(String name,float bal,int index){
		this.cusName=name;
		this.accBalance=bal;
		this.cusId=index;
	}
	Customer(){
		
	}
	
	void createCustomer() {
		Scanner in =new Scanner(System.in);
		System.out.println("enter the customer name : ");
		String name=in.nextLine();
		System.out.println("Enter the account balance : ");
		Float bal;
		for(;;) {
			float amt=in.nextFloat();
			try {
				if(amt<0) {
					throw new ArithmeticException();
				}
				else {
					System.out.println("valid amount received ");
					bal=amt;
					break;
				}
			}
			catch(Exception e) {
				System.out.println("Enter the valid Amount");
			}
			
		}
		
		Customer cus=new Customer(name,bal,index);
		cusArr[index]=cus;
		index++;
		System.out.println("Customer created Succesfully");
		
	}
	public void display() {
		for(int i=0;i<index;i++) {
			System.out.println("Customer Name : "+cusArr[i].cusName);
			System.out.println("Customer Acc Balance :"+cusArr[i].accBalance);
			System.out.println("Customer id :"+cusArr[i].cusId);
			System.out.println(" ");
		}

	}
	
	void addBal() {
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter customer id : ");
		int cusid=in.nextInt();
		
		if(cusid<index && cusid>=0) {
			System.out.println("enter the amount to add : ");
			int amt=in.nextInt();
			
			cusArr[cusid].accBalance+=amt;
			System.out.println("Amount added to balance ");
		}
		else {
			System.out.println("customer not found ");
		}
	}
	
}

class GiftCard{
	int giftCardId;
	int cusId;
	int pin;
	float cardBalance;
	String cardStatus;
	String cardLevel;
	GiftCard GifArr[]=new GiftCard[100];
	int index=0;
	int points;
	
	
	public GiftCard() {
	}
	
	public GiftCard(int cusId,int pin,float bal,String cardStatus,String cardLevel,int id,int points) {
		this.cusId=cusId;
		this.pin=pin;
		this.cardBalance=bal;
		this.cardStatus=cardStatus;
		this.cardLevel=cardLevel;
		this.giftCardId=id;
		this.points=points;
	}
	
	void createCard(Customer obj) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter customer id : ");
		int cusId=in.nextInt();
		System.out.println("enter the customer pin ");
		int pin=in.nextInt();
		System.out.println("enter customer card balance : ");
		float bal=in.nextFloat();
		obj.cusArr[cusId].accBalance-=bal;
		
		GiftCard gc=new GiftCard(cusId, pin, bal,"Active","Bronze",index,points);
		GifArr[index]=gc;
		index++;
		
		System.out.println("Card created Succesfully");
		
		
	}
	
	void display(Customer obj) {
		for(int i=0;i<index;i++) {
			System.out.println("Gift card id: "+GifArr[i].giftCardId);
			System.out.println("Customer Name : "+obj.cusArr[GifArr[i].cusId].cusName);
			System.out.println("Gift Card Balance : "+GifArr[i].cardBalance);
			System.out.println("Card Status "+GifArr[i].cardStatus);
			System.out.println("Card level :"+GifArr[i].cardLevel);
			System.out.println("Reward points : "+GifArr[i].points);
			
			System.out.println(" ");
			
		}
	}
	
	void topup(Customer obj) {
		Scanner in=new Scanner (System.in);
		int gifid;
		int pin;
		int addamt;
		
		System.out.println("enter Gift id/ card number  : ");
		gifid=in.nextInt();
		
		
		
		if (gifid<index && gifid>=0 ) {
			System.out.println("enter pin : ");
			pin=in.nextInt();
			
			
			if(GifArr[gifid].pin==pin) {
			
			if(GifArr[gifid].cardStatus.equals("Active")) {
				System.out.println("enter topup amount : ");
				addamt=in.nextInt();
				
				int custid=GifArr[gifid].cusId;
				
				obj.cusArr[custid].accBalance-=addamt;
				GifArr[gifid].cardBalance+=addamt;
				
				System.out.println("Top up successfully");
				
			}
			else {
				System.out.println("card is not active");
			}
		}
		else {
			System.out.println("pin  number is wrong");
		}
		}
		else {
			System.out.println(" card number is wrong");
		}
	}
	
	void CloseCard(Customer obj) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the giftcard id : ");
		int gifid=in.nextInt();
		
		System.out.println("enter pin ");
		int pin=in.nextInt();
		
		if(gifid <index && gifid>=0) {
			System.out.println("enter pin : ");
			
			if(GifArr[gifid].pin==pin) {
				GifArr[gifid].cardStatus="Closed";
				obj.cusArr[GifArr[gifid].cusId].accBalance+=GifArr[gifid].cardBalance;
				GifArr[gifid].cardBalance=0;
				System.out.println("Gift Card Closed ");
			}
			else {
				System.out.println("Incorrect pin ");
			}
		}
		else {
			System.out.println("Gitcard not found ");
		}
		
		
	}
	
	void Blockcard() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the giftcard id : ");
		int gifid=in.nextInt();
		
	
		
		if(gifid <index && gifid>=0) {
			System.out.println("enter pin : ");
			int pin=in.nextInt();
			
			if(GifArr[gifid].pin==pin) {
				GifArr[gifid].cardStatus="Blocked";
			
			}
			else {
				System.out.println("incorrect pin ");
			}
		}
		else {
			System.out.println("Gift Card not found");
		}
		
	}
	
	void UnBlock() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the giftcard id : ");
		int gifid=in.nextInt();
		
		System.out.println("enter pin ");
		int pin=in.nextInt();
		
		if(gifid <index && gifid>=0) {
			System.out.println("enter pin : ");
			
			if(GifArr[gifid].pin==pin) {
				GifArr[gifid].cardStatus="Active";
				System.out.println("Gif Card UnBlocked ");
			
			}
			else {
				System.out.println("Incorrect pin ");
			}
		}
		else {
			System.out.println("Giftcard not found");
		}
		
	}

}


class Purchase {
	Scanner in=new Scanner(System.in);
	int n;
	int sum;
	int gifId;
	Purchase[] tr=new Purchase[100];
	int index=0;
	 Purchase() {
		

	}
	 Purchase(int sum,int n,int index,int gifid){
		this.sum=sum;
		this.n=n;
		this.index=index;
		this.gifId=gifid;
		
	}
	void sales(GiftCard gc) {
	System.out.println("Enter number of products : ");
	int n=in.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		System.out.println("enter product "+i+"price : ");
		sum+=in.nextInt();
	}
	
	System.out.println("Total bill Amount : "+sum);
	
	System.out.println("enter gift id : ");
	int gifid=in.nextInt();
	
	if (gifid<gc.index && gifid>=0 ) {
		System.out.println("enter pin : ");
		int pin=in.nextInt();
		
		
		if(gc.GifArr[gifid].pin==pin) {
		
		if(gc.GifArr[gifid].cardStatus.equals("Active")) {
			
			int diff=sum/500;
			gc.GifArr[gifid].points+=(50*diff);
			
			gc.GifArr[gifid].cardBalance-=sum;
			
			
			System.out.println("amount reduced using gift card ");
			Purchase pr=new Purchase(sum,n,gifid,index);
			tr[index]=pr;
			index++;
			
		}
		else {
			System.out.println("card is not active");
		}
	}
	else {
		System.out.println("pin  number is wrong");
	}
	}
	else {
		System.out.println(" card number is wrong");
	}
	
	if(gc.GifArr[gifid].points >200 && gc.GifArr[gifid].points <=500) {
		gc.GifArr[gifid].cardLevel="Silver";
	}
	else if(gc.GifArr[gifid].points >500 && gc.GifArr[gifid].points <=1000) {
		gc.GifArr[gifid].cardLevel="Gold";
	}
	else if(gc.GifArr[gifid].points >1000) {
		gc.GifArr[gifid].cardLevel="Platinum";
	}
	else {
		gc.GifArr[gifid].cardLevel="Bronze";
	}
	}
	
 void displayTrans() {
	 for(int i=0;i<index;i++) {
		 System.out.println("Transaction ID : "+tr[i].index);
		 System.out.println("Gift Card ID :"+tr[i].gifId);
		 System.out.println("Total products :"+ tr[i].n);
		 System.out.println("Total product amount : "+tr[i].sum);
		 System.out.println(" ");
	 }
 }

	
}


	



public class gift_card {
	public static void main(String [] args) {
		Scanner in=new Scanner(System.in);
		Customer obj=new Customer();
		GiftCard gc=new GiftCard();
		Purchase pr=new Purchase();
		
	
		
		while(true) {
			System.out.print("\n 1)create customer \n 2)Display user \n 3)Create card \n 4)display card "
					+ "\n 5)topup to card  \n 6)purchase \n 7)close card\n 8)Block Card \n 9)Unblock Card "
					+ "\n 10)Add Amount to customer \n 11)Summary ");
			int n=in.nextInt();
			
			switch(n) {
			case 1:
				obj.createCustomer();
				break;
			case 2:
				obj.display();
				break;
			case 3:
				gc.createCard(obj);
				break;
			case 4:
				gc.display(obj);
				break;
			case 5:
				gc.topup(obj);
				break;
			case 6:
				pr.sales(gc);
				break;
			case 7:
				gc.CloseCard(obj);
				break;
			case 8:
				gc.Blockcard();
				break;
			case 9:
				gc.UnBlock();
				break;
			case 10:
				obj.addBal();
				break;
			case 11:
				System.out.println("Summary Of Customers");
				obj.display();
				System.out.println("Summary od Giftcard ");
				gc.display(obj);
				System.out.println("Summary of Transaction");
				pr.displayTrans();
				
			
				
				
				
			}
		}
		
		
	}
}

	
