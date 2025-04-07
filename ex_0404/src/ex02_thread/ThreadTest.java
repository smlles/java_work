package ex02_thread;


//스레드 생성방법 
//1. Thread 클래스 상속받기

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		//작업할내용
		for(int i =0; i<10;i++) {
			System.out.println("스레드 진행 중 "+i);
		}
		
	
		
	}
}
