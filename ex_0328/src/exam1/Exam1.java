package exam1;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//정수가 아닌 것을 입력했을 대
		//해당 값은 정수가 아닙니다
		//를 출력하기
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		int result;
		try {
			System.out.print("정수 입력 : ");
			str = sc.next();
			
			int number = Integer.parseInt(str);
			
			System.out.println("입력 한 값 : "+number);
		} catch (Exception e) {
			System.out.println(str+"은 정수가 아닙니다.");
		}
	}
}
//