package ex02_break;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//1~50사이의 난수를 생성하고
		//난수를 맞추는 프로그램 만들기
		//적은 값이 난수보다 작으면
		//"숫자가 더 큽니다."
		//크다면 "숫자가 더 작습니다"
		
		//경우의 수, 
		//난수와 같을 때
		//난수보다 작을 때
		//난수보다 클 때
		
		//반복 횟수를 특정 할 수 없으니 while문 사용
		Scanner sc = new Scanner(System.in); 
		Random rnd = new Random();
		int random_number = rnd.nextInt(50)+1;
		boolean random_quiz = false;
		int try_count=0;
		while(!random_quiz) {
			if(try_count==10) {
				System.out.println("10번의 기회나 줬는데 ㅉㅉㅉ");
				break;
			}
			try_count++;
			System.out.print("숫자를 입력해주세요.랜덤 숫자는 1~50 사이 정수입니다. : ");
			int i = sc.nextInt();
			
			if(i>50||i<1) {
				System.out.println("너무 작거나, 너무 큰 수를 입력했습니다.정답은 1~50 사이의 정수입니다.");
				try_count--;
				continue;
			}else if(i<random_number) {
				System.out.println("더 큰 숫자입니다.");
				continue;
			}else if (i > random_number) {
				System.out.println( "더 작은 숫자입니다.");
				continue;
			}else if (i == random_number) {
				if(try_count==1) {
					System.out.println("한번에 찾다니 정말 대단한데?");
					break;
				}
				System.out.println("정답입니다.");
				System.out.printf("당신이 이 숫자를 찾기 위해 시도한 횟수는 %d회 입니다.",try_count);
				break;
			}
			
		}
		//for(;;) << for문 무한 루프
		

	}

	}

