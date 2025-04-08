package ex01_Thread;

import java.util.Scanner;

//Scanner를 이용해 숫자를 입력받고
//스레드에서 입력받은 숫자부터 1씩 감소하다 0이 되었을 때
//종료와 함께 프로그램이 종료되도록 만들고
//Thread는 Thread count에
public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ThreadCount tc = new ThreadCount();
		Thread t1 = new Thread(tc);
		
		System.out.println("숫자 넣기");
		int num = sc.nextInt();
		tc.setCount(num);
		t1.start();		
	}
}



class ThreadCount implements Runnable{
	private int count;
	// 값 전달하기
	//1. 객체생성
	//2. 주기 set  받기 get 
	public void setCount(int count) {
		this.count=count;
	}
	
	public void run() {
		try {
		for (int i = count ; i>=0; i--) {
			System.out.println(i);
			Thread.sleep(500);
		}
		System.out.println("종료");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
