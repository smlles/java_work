package ex03_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05_throws {
	
	public static void checkYourSelf(Scanner sc) throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자있는 것이 좋다.");
		System.out.print("선택 : ");
		int check = sc.nextInt();
		
		if(check ==1) {
			System.out.println("당신은 E야");
		}else {
			System.out.println("당신은 I야");
		}
	}
	
	
	public static void main(String[] args) {
		//예외 던지기
		//메서드에서 발생한 예외를 직접 처리하는 것이 아닌
		//메서드를 호출한 쪽에서 대신 처리해주는 것
		Scanner sc = new Scanner(System.in);
		
		try {
			Ex05_throws.checkYourSelf(sc); // 예외가 여기서 나옴
		} catch (Exception e) {
			System.out.println("잘못 된 입력입니다.");
		} finally {
			System.out.println("종료");
		}
		
	}
}
