package ex03_try_catch;

import java.util.Scanner;

public class Ex06_throw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = 0;
		
		while(true) {
			try {
				System.out.print("숫자 입력 0~50 : ");
				val = sc.nextInt();
				if(val==-1) {
					break;
				}
				
				if(val<-1 || val>50) {
					//throw new 예외객체();
					throw new Exception("숫자의 허용 범위가 아닙니다.");
				}
			} catch (Exception e ) {
				System.out.println("에러 메시지 : "+e.getMessage());
			}
		}System.out.println("종료");
	}
}