package ex02_thread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadName tn = new ThreadName();
		tn.start();
		//main도 하나의 Thread이다.
		//우선순위 1~10 , 10이 가장 높음
		//스레드 상태 RUNNABLE - 실행 가능한  상태
		System.out.println("현재 실행되고 있는 스레드의 이름 : "+ Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태 : "+ Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위 : "+ Thread.currentThread().getPriority());
	}

}
