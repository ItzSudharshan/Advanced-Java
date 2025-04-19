import java.util.*;
public class SynchronisedJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter count = new Counter();
		
		Thread t1 = new Thread(() -> {
			for(int i = 1 ; i<= 1000; i++) {
				count.increment();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 1 ; i<= 1000; i++) {
				count.increment();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final Count Value is = "+count.getCount());
	}

}
class Counter{
	private int count = 0;
	
	public synchronized void increment(){
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
/*
Final Count Value is = 2000
*/