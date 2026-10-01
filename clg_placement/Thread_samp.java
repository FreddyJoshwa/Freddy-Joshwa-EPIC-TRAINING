package clg_placement;

class Counter{
	int count=0;
	
	void increment() {
		count++;
	}
}
class Mydata  implements Runnable {
	Counter c;
	public Mydata(Counter c) {
		this.c=c;
	}
	public void run() {
	
			for(int i=0;i<10;i++) {
				c.increment();
			}
	}
	
}
public class Thread_samp {

	public static void main(String[] args) throws InterruptedException{
		Counter c=new Counter();
		Mydata t1=new Mydata(c);
		Mydata t2=new Mydata(c);
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);

		th1.start();
		th1.join();
		th2.start();
		th2.join();
		
		System.out.println("Main thread");
	}

}
