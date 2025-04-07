package ex01_thread;

public class JoinMain {

	public static void main(String[] args) {
		JoinExample je = new JoinExample();
		je.start();
		
		try {
			je.join(); //main 스레드는 worker 스레드가 끝날 때 까지 기다림
		} catch (Exception e) {	
		}
		System.out.println("main 스레드 종료");
	}
}
