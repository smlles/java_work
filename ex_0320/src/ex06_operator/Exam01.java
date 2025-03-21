package ex06_operator;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		//국영수에 대한 점수를 키보드로 이용해 정수로 입력받고
//		1. 세 과목에 대한 합계
//		2. 평균 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		int k_score =sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int e_score = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int m_score = sc.nextInt();
		
		int sum = (k_score+e_score+m_score);
		System.out.printf("점수 총 합 : %d\n", sum);
		float avg = sum/3;
		System.out.printf("평균 : %f\n", avg);
		
		String result3 = k_score > 40 && e_score > 40 && m_score > 40 && avg>= 60 ? "합격" : "불합격";
		System.out.println(result3);

		//상자 1개에 농구공 5개
		//N개의 농구공을 담기 위한 박스 개수를 구하세요.
		//농구공의 개수는 키보드를 통해 입력받는다
		
		System.out.print("농구공은 몇개인가요? : ");
		int basket_ball = sc.nextInt();
		int need_box = basket_ball % 5 == 0 ? basket_ball / 5 : basket_ball /5 +1 ;
		
		System.out.println("필요한 상자의 개수는... : " +need_box+"개");
		
		
		
		//과수원에서 배, 사과, 오렌지를 키우는데
		//하루 생산량이 각 5, 7 ,5개이다. 과수원에서 하루에 생산되는 총 개수를 출력
		//시간당 전체 과일의 평균 생산 갯수를 출력
		//평균 변수는 float형
		
		int day_pear = 5;
		int day_apple = 7;
		int day_orange = 5;
		
		int day_fruit = day_pear+day_apple+day_orange;
		System.out.println("하루에 생산되는 과일의 총 개수 : "+day_fruit);
		
		float hour_fruit = (float)day_fruit/24;  
		System.out.printf("시간 당 생산되는 과일의 개수 : %.2f\n" , hour_fruit);
		
		

	}

}
