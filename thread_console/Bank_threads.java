package thread_console;


class BankAccount{
	
	int balance =10000;
	


	
	public BankAccount(int balance) {
		this.balance = balance;
		
	}
	public BankAccount() {
		
	}
	
	public void deposit(DepositThread dep) {
		dep.depoamt+=balance;
	}
	public void withdrew(WithdrewThread ) {
		balance-=withamt;
		
	}
	public void dispbal() {
		System.out.println(balance);
	}
	
}

class DepositThread extends Thread{
	int depoamt;
	public void run() {
		for(int i=0;i<5;i++) {
			depoamt+=1000;
		}
		
	}
}

class WithdrewThread extends Thread{
	int withamt;
	public void run() {
		for(int i=0;i<5;i++) {
			withamt+=500;
		}
		
	}
}
public class Bank_threads {

	public static void main(String[] args) throws InterruptedException{
		BankAccount b=new BankAccount();
		DepositThread dep=new DepositThread();
		WithdrewThread with=new WithdrewThread();
	}

}
