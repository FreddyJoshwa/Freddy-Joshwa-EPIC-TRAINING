package clg_placement;

class Counteer{
	int count=0;
	
	synchronized void increment() {
		count++;
	}
}

class MyData4 extends Thread{
	Counter c;//counter obj
	MyData4(Counter c){
		this.c=c;
	}
	
	
public void run() {
		for(int i=0;i<1000;i++) {
			c.increment();
		}
	}
}

public class thread_basix {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		MyData4 t1 = new MyData4(c);
		MyData4 t2 = new MyData4(c);
		t1.start();
	
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}

}

