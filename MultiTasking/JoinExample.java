import java.util.*;
class LearningThread extends Thread{
	private String taskName;
	
	public LearningThread(String taskName) {
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		System.out.println(taskName+" Has Been Started....");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println(taskName+" was Interrupted...");
		}
		System.out.println(taskName+" is Completed....");
	}
}
public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Learning Journey Started....");
		LearningThread classThread = new LearningThread("Live Class");
		LearningThread homeworkThread = new LearningThread("Homework Practise");
		LearningThread asessmentThread = new LearningThread("Assessment Challenge");
		
		//start the learning Threads
		classThread.start();
		homeworkThread.start();
		asessmentThread.start();
		
		try {
			classThread.join();
			homeworkThread.join();
			asessmentThread.join();
		}catch(InterruptedException e) {
			System.out.println("Main learning Journey Interrupted while Waiting...");
		}
		System.out.println("All learning activities completed. Ready for the next journey!");
	}

}
