package ex01_Thread;

import java.util.Random;
import java.util.Scanner;

//StartGame 메서드를 만들고
//그 안엔서 1~100 사이의 난수 두개를 더하는 문제를 출제
//키보드에서 값을 입력하여 5문제가 정답될 때 까지 로직을 반복
//모든 문제를 맞추는데 몇초가 걸렸는지 화면에 출력하여 프로그램 종료

//QuizMain클래스 
//QuizThread qt=new QuizThread();
//qt.start()
//qt.startGame()
public class QuizThread extends Thread {
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	private int count=0;
	boolean started = true;
	//필요한건 밖에 미리 만들자
	
	public void StartGame() {
		for(int i = 1;i<=5;) {
			int x = r.nextInt(100)+1;
			int y = r.nextInt(100)+1;
			int answer= x+y;	
			System.out.printf("%d + %d = ",x,y);
			
			int a = sc.nextInt();
			if (a==answer) {
				System.out.println("정답");
				i++;
					if(i==6) {
					started=false;
					}
				}else {
					System.out.println("틀렸음 ㅋㅋ");
					
				}
		}System.out.println("5문제를 맞추는데 "+count+"초 걸렸습니다.");
	}
	
	@Override
	public void run() {
			while(started) {
				try {	
					Thread.sleep(1000);
					count++;
				} catch (Exception e) {
				}
			}	
	}
}
