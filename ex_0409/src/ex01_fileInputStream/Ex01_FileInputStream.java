package ex01_fileInputStream;

import java.io.IOException;

public class Ex01_FileInputStream {

	public static void main(String[] args) {
		
		byte[] keyboard = new byte[100];
		System.out.print("값 : ");
		//Scanner sc = new Scanner(System.in);
		//System : System 클래스
		//in : input스트림 객체
		//System.in : 표준 입력 스트림
		//표준입력 스트림 : 자바에서 프로그램이 외부로부터 데이터를 
		//입력 받을 수 있게 해주는 기본 통로
		
		//사용자가 키보드로 입력한 값을 keyboard 배열에 저장
		//사용자가 엔터치기전까지 입력 받는다.
		//엔터키 까지 포함되어 저장
		try {
			System.in.read(keyboard);
			String s = new String(keyboard).trim();
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}