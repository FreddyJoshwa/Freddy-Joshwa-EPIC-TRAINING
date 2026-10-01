package clg_placement;

class data extends Thread{
	
	public void run() {
 
		for(int i=1;i<=5;i++) {
			System.out.println("Run : "+i);
			try {
				Thread.sleep(100);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
public class thread_basics {

	public static void main(String[] args) throws InterruptedException {

		data t1=new data();

		t1.start();
		t1.join();
		for(int i=1;i<=5;i++) {
			System.out.println("Main :"+i);
			Thread.sleep(1000);
		}
		

//		Thread t1=new Thread(()->{
//			System.out.println("hello");
//		});
//		
//		Thread t2=new Thread(()->{
//			System.out.println("hi");
//		});
//		System.out.println("one");
//
//		t1.start();
//		t2.start();
//		System.out.println("two");
	}

}
