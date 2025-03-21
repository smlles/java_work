package ex04_while;

import java.util.Random;
import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		//while문은 반복 횟수가 정해져있을때도 사용 할 수 있지만
		//반복 횟수를 정확히 알 수 없을 때 유용하다
		
		/*초기식
		 * while(조건식){
			반복할 일
				
			증감식
			}
		*/
		int i = 1;
		while(i<4) {
			System.out.println(i);
			i++;
		}
		//반복 횟수가 정해져있지 않다면
//		Random rnd = new Random();
//		int random = rnd.nextInt(10)+1;//1~10 사이의 난수 대입
		Scanner sc = new Scanner(System.in);
//		boolean is_answer = true;
//		while(is_answer) {
//			System.out.print("정답 : ");
//			int answer= sc.nextInt();
//			if(answer== random) {
//				System.out.println("너, 재능있어.");
//				is_answer=false;
//			}
//		}
		
		//int 타입 변수 num에 정수를 입력받고, 각 자리수 합을 더한 결과를 출력하세요.
		System.out.println("정수 입력");
		int sum=0;
		int num = sc.nextInt();
			while(num>0) {
				sum+=num%10;
				num=num/10;			
			}
			System.out.printf("각 자리 수의 합 = %d\n",sum);	
	}
}
