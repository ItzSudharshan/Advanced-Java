import java.util.*;
public class CreatingThreadByExtendingThreadclass extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i<= 5 ; i++) {
			System.out.println("Thread Running: "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Thread was Interuppted...");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThreadByExtendingThreadclass myThread = new CreatingThreadByExtendingThreadclass();
		myThread.start();

	}

}
