import java.util.*;

public class Interrupt implements Runnable {
	@Override
	public void run() {
		System.out.println("Download Started....");
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Download Interrupted...");
				return;
			}
			System.out.println("Downloaded..." + i * 10 + " %...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread downloadThread = new Thread(new Interrupt());
		downloadThread.start();
		try {
			Thread.sleep(3000); // Main thread sleeps for 3 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("User decides to cancel the download.");
		downloadThread.interrupt(); // Interrupt the download thread
	}

}
/*
 * Download Started....
 * Downloaded...10 %...
 * Downloaded...20 %...
 * User decides to cancel the download.
 * Download Interrupted...
 */