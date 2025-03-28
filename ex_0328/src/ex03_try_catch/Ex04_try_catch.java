package ex03_try_catch;

import java.util.Scanner;

public class Ex04_try_catch {
	public static void main(String[] args) {
		//finally
		//예외 유무와 상관없이 실행되는 구문이며 생략할 수 있다.
		//예외를 처리할 때, 예외와 상관없이 반드시 처리해야 하는 구문들을 작성 할 때 사용
		//보통, 외부 연동이나 예외가 발생해도 정상 종료되어야 할 구문들에서 사용
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("숫자 입력 : ");
			int number = sc.nextInt();
			System.out.println("입력한 숫자 : " +number);
		} catch (Exception e) {
			System.out.println("숫자만 입력해야 함");
		}finally {
			//종료 코드들 
			//스캐너 연결종료, DB연결 종료 ....
			sc.close();
		}
	}
}
