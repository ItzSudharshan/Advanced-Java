package CreatingThreads;
class VideoThread implements Runnable{
	public void run() {
		String t = Thread.currentThread().getName();
		for(int i = 1; i<=5 ; i++) {
			System.out.println(t+" is Running..");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
			System.out.println(t+" was Interrupted.");
		}
	}
		System.out.println(t+" excution Complted");
	}
}

class ChatThread implements Runnable{
	public void run() {
		String t = Thread.currentThread().getName();
		for(int i = 1 ; i<=5; i++) {
			System.out.println(t+" is Running..");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println(t+" was Interrupted");
			}
		}
		System.out.println(t+" execution Completed");
	}
}

class ScreenThread implements Runnable{
	public void run() {
		String t = Thread.currentThread().getName();
		for(int i = 1 ; i<=5; i++) {
			System.out.println(t+" is Running..");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println(t+" was Interrupted");
			}
		}
		System.out.println(t+" execution Completed");
	}
}

public class RunnableExampleCode {
	public static void main(String[] args) {
		VideoThread vt = new VideoThread();
		ChatThread ct = new ChatThread();
		ScreenThread sc = new ScreenThread();
		
		Thread t1 = new Thread(vt);
		t1.setName("Video Thread");
		
		Thread t2  = new Thread(ct);
		t2.setName("Chat Thread");
		
		Thread t3 = new Thread(sc);
		t3.setName("Screen Thread");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
/*
Screen Thread is Running..
Chat Thread is Running..
Video Thread is Running..
Video Thread is Running..
Video Thread is Running..
Video Thread is Running..
Video Thread is Running..
Video Thread excution Complted
Chat Thread is Running..
Screen Thread is Running..
Chat Thread is Running..
Screen Thread is Running..
................Keeps on Executing Multiple Threads*/