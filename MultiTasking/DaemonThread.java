import java.util.*;
class BackGroundTask implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("BackGround Task is Running...");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DaemonThread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread daemonThread = new Thread(new BackGroundTask());
		daemonThread.setDaemon(true);
		daemonThread.start();
		
		System.out.println("Main Application is Running....");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Application has Finished Executing....");
		 // After this point, the program will exit, and the daemon thread will stop automatically
		
	}

}
/*
 * Main Application is Running....
BackGround Task is Running...
BackGround Task is Running...
BackGround Task is Running...
BackGround Task is Running...
BackGround Task is Running...
Main Application has Finished Executing....
 */
