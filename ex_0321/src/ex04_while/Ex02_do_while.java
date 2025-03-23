package ex04_while;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		/*while문과 같이 조건을 만족할 때 까지 반복한다
		 *단,다른점은 일단 루프를 한번 한 뒤 조건을 검사한다.
		 *즉, 조건식의 결과와 상관없이 한번은 반드시 실행한다. 
		 */
		
		/*do{
		 * 	반복할 일
		 * }while(조건식)
		 * 	 * */
		
		int i = 11;
		do {
			System.out.println(i);
		}while(i<=10);
		
		//1~10 총합 구하기
		int sum = 0;
		i = 0;
		do {
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println(sum);
		
		//비밀번호 확인 프로그램 만들기
		//사용자로부터 비밀번호를 입력 받는데 올바른 비밀번호가 
		//입력 될 때 까지 계속 입력 요구하기
		//비밀번호는 9486
		Scanner sc = new Scanner(System.in);
		boolean log_in = true;
		int pw = 9486;
		int input_pw;
		do {
		System.out.println("비밀번호를 입력하세요. : " );
		input_pw = sc.nextInt();
		if (input_pw != pw) {
			System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
			
		}else if(input_pw == pw){
			log_in = false;
			System.out.println("접속 성공!");
		}
		}while (log_in);
		
		// 학생의 국어, 영어, 수학 점수를 입력받는다.
		//단, 각 과목은 40점 이상이어야하며
		//40점 미만이면 다시 입력받는다.
		int k_score,e_score,m_score;
		boolean score = true;
		do {
			System.out.println("국어 점수를 입력하세요.");
			k_score = sc.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			e_score = sc.nextInt();
			System.out.println("수학 점수를 입력하세요.");
			m_score = sc.nextInt();
			
			if(k_score<40||e_score<40||m_score<40) {
				System.out.println("불합격입니다. 다시 입력하세요.");
			}else if (k_score>=40&&e_score>=40&&m_score>=40) {
				System.out.println("합격입니다.");
				score = false;
			}
		}while (score);
		
		
		
	}
}

