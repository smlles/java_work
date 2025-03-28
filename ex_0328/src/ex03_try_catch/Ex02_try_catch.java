package ex03_try_catch;

import java.util.Scanner;

public class Ex02_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			try {
				System.out.print("정수 입력 : ");
				int score = sc.nextInt();
				
				if(score>=65) {
					System.out.println("합격");
				}else {
					System.out.println("불합격");
				}
				//Exception e -> 하위 예외에 대한 모든 첯리
				//특정 클래스 지정시, 해당 예외만 처리
			} catch (Exception e) {
				e.printStackTrace();//발생한 예외가 무엇인지 출력해줌
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println("종료");
	}
}
