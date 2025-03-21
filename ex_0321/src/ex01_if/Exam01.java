package ex01_if;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 농구공 문제를 if로 구하기
		//상자 1개에 농구공 5개
		//N개의 농구공을 담기 위한 박스 개수를 구하세요.
		//농구공의 개수는 키보드를 통해 입력받는다
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공은 몇갠데?");
		int basket_ball = sc.nextInt();
		System.out.print("상자에 공이 몇개 들어가?");
		int ball_in_box = sc.nextInt();
		int need_box = basket_ball/ball_in_box;
		
		if(basket_ball%ball_in_box !=0) {
			need_box++;
		}
		System.out.println("상자는 이만큼 필요해! "+ need_box);
	}

}
