package ex02_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
	
		
		ThreadTest t1 = new ThreadTest();
		t1.start();
		
		
		RunableTest t2 = new RunableTest();
		Thread t = new Thread(t2);
		t.start();
		
		for(int i =0; i<10;i++) {
			System.out.println("Main "+i);
		}
	}
}
