package ex01_if;

import java.util.Scanner;

public class Ex01_if {

	public static void main(String[] args) {
		//제어문 (control statement
		// 일반적으로 프로그램은 위에서 아래로 실행된다.
		//다만, 그렇게만 된다면 길어지거나 어려워진다.
		
		//조건문
		//조건식에 따라, 프로그램의 흐름을 제어 할 수 있는 문법
		//조건식 = true,false로 결과가 반환되는 것
		//조건문 종류
		//if 고려해야 하는 조건이 적을 때
		//switch 고려해야 하는 조건이 많을 때
		//특정 개수에 따라 반드시 둘 중 하나를 선택해야 하는 것은 아니다.
		
		//단순 if 
		//조건문 중 가장 기본이 된다.
		//if (조건식){ 
		//	참일 때 실행할 문장
		//}
		
		//만약 실행해야하는 명령이 하나라면, 중괄호를 생략 할 수 있다.
		//if(조건식) 조건식이 참일 때 실행할 문장;
		
		//간결하고 가독성이 좋은 코드를 만드는 중괄호 , 들여쓰기
		//중괄호 블록은 여러 수행문을 하나로 묶기 위해 작성
		//수행문이 하나일땐 생략할 수 있지만, 중괄호를 사용하면 가독성이 좋고
		//해석이 용이하고, 버그를 찾아 수정하는 데 도움이 된다
		
		//중괄호를 사용 할 땐 들여쓰기를 하는 것이좋다.
		//들여쓰기에는 탭이나 space를 사용한다.
		//단, 하나만 일관적으로 사용하는것이 편함
		
		int result = 0;
		if(3>2) {
			result = 3;
		}
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if (age > 19) {
			System.out.println("성인입니다.");	
		}
		System.out.println("프로그램 종료.");
	}
}

