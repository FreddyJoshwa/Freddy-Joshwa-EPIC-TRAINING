package Practise_console;
import java.util.Scanner;

abstract class Payment{
	int TransId;
	String Cusname;
	double Amt;
	double finalamt;
	int index=0;
	String type;
	Payment arr[]=new Payment[100];
	
	Payment() {
		
	}
	
	Payment(String name,double amt,String type){
	
		this.Cusname=name;
		this.Amt=amt;
		this.type=type;
		

		
	}
	
	void display() {
		System.out.println("Name : "+ Cusname);
		System.out.println("Trans ID : "+TransId);
		System.out.println("Amount : "+Amt);
	}
	
	void Finalamt(double fees,double cashback) {
		display();
		finalamt=(Amt+fees)-cashback;
		System.out.println("Final amt is : "+finalamt);
		System.out.println(" ");
	}
	
	
	abstract void Validate();
	abstract void  Processing();
	abstract void transactionfee();
	abstract void cashback();
	
	
}

class Creditcard extends Payment{
	String Cardno;
	double fees;
	
	double cashback;
	double finalamt;
	
	Creditcard(){
		
	}
	
	
	Creditcard(String name,double amt,String cardno,String type){
		super(name,amt,type);
		this.Cardno=cardno;
		
		
	}
	
	void transactionfee() {
		fees=Amt*0.02;
		
		
	}
	
	void cashback() {
		
		cashback=Amt*0.05;
	}
	

	void Processing() {
		transactionfee() ;
		cashback();
		Finalamt(fees,cashback);
			
		
		
		
	}
	void Validate() {
		if(Cardno.matches("\\d{16}")) {
			System.out.println("Credit Card : ");
			System.out.println("card validated");
			Processing();
		}
		else {
			System.out.println(" card Not Validated ");
			System.out.println(" ");
		}
	}
	
	
}

class Upi extends Payment{

	String upi_id;
	double fees;
	double cashback;
	double finalamt;
	
	Upi(String name,double amt,String upi_id,String type){
		super(name,amt,type);
		this.upi_id=upi_id;
	
		
	}
	
	void transactionfee() {
		fees=Amt*0.005;
		
		
	}
	
	void cashback() {
		
		cashback=Amt*0.02;
	}
	

	void Processing() {
		transactionfee() ;
		cashback();
		Finalamt(fees,cashback);
		
	}
	void Validate() {
		if(upi_id.contains("@")) {
			System.out.println("Upi : ");
			System.out.println("upi id  validated");
			Processing();
		}
		else {
			System.out.println(" upi id Not Validated ");
		}
		System.out.println(" ");
	}

	
	
}
class Netbanking extends Payment{
	


	String accno;
	double fees;
	double cashback;
	double finalamt;
	
	Netbanking(String name,double amt,String accno, String type){
		super(name,amt,type);
		this.accno=accno;
	}
	
	 Netbanking() {
		// TODO Auto-generated constructor stub
	}

	void transactionfee() {
		fees=Amt*0.01;
	}
	
	void cashback() {
		
		cashback=Amt*0.01;
	}
	

	void Processing() {
		transactionfee() ;
		cashback();
		Finalamt(fees,cashback);
		
	}
	void Validate() {
		if(accno.matches("\\d{10}")) {
			System.out.println("Net Banking :");
			System.out.println("Account Number   validated");
			Processing();
		}
		else {
			System.out.println("Account number Not Validated ");
		}
	}
	
	
}

public class Abstarct_sample {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		Creditcard cd=new Creditcard();
		

		
		while(true) {
			System.out.println("Select mode of Transaction \n 1)Credit card  \n2)UPI Transaction \n 3)Net Banking \n 4)display transaction");
			int n=obj.nextInt();
			switch(n) {
			case 1:
				System.out.println("Credit card : ");
				System.out.println("Enter your name : ");
				String name=obj.next();
				System.out.println("Enter your Amount : ");
				double amt=obj.nextInt();
				System.out.println("Enter your card number  : ");
				String cardnum=obj.next();
				String type1="Credit Card";
				Creditcard dc=new Creditcard(name,amt,cardnum,type1);
				cd.arr[cd.index]=dc;
				cd.index++;
				break;
				
			case 2:
				System.out.println("UPI Transaction  : ");
				System.out.println("Enter your name : ");
				String name1=obj.next();
				System.out.println("Enter your Amount : ");
				double amt1=obj.nextInt();
				System.out.println("Enter your UPI ID : ");
				String upi_id=obj.next();
				String type="UPI";
				Upi up=new Upi(name1,amt1,upi_id,type);
				cd.arr[cd.index]=up;
				cd.index++;
				break;
				
			case 3:
				System.out.println("Net Banking  : ");
				System.out.println("Enter your name : ");
				String name2=obj.next();
				System.out.println("Enter your Amount : ");
				double amt2=obj.nextInt();
				System.out.println("Enter your Account number  : ");
				String accnum=obj.next();
				
				String type2="Net Banking";
				Netbanking nb=new Netbanking(name2,amt2,accnum,type2);
				cd.arr[cd.index]=nb;
				cd.index++;
				break;
				
			case 4:
				System.out.println(cd.index);
				System.out.println("Transactions :");
				for(int i=0;i<cd.index;i++) {
					System.out.println("Cust id :"+cd.arr[i].index);
					System.out.println("Cust Name :"+cd.arr[i].Cusname);
					System.out.println("Amount :"+cd.arr[i].Amt);
					System.out.println("Transaction Type  :"+cd.arr[i].type);
					System.out.println();
				}
				
				
			}
		}

	}

}
