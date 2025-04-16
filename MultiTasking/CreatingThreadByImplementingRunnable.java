import java.util.*;
public class CreatingThreadByImplementingRunnable implements Runnable {
	
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Runnable Running: "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Thread was Interrupted");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThreadByExtendingThreadclass myThread = new CreatingThreadByExtendingThreadclass();
		Thread t1 = new Thread(myThread);
		
		t1.start();

	}

}

/*
Thread Running: 1
Thread Running: 2
Thread Running: 3
Thread Running: 4
Thread Running: 5
*/