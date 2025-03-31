package ex06_list;

import java.util.ArrayList;
import java.util.Scanner;

//유저 아이디 패스워드 userinfo 필드 private
// main에서 유저의 정보를 arrayList에 추가 출력

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<UserInfo> ui = new ArrayList<>();
		
		
		while(true) {
		UserInfo userInfo= new UserInfo();

		System.out.print("아이디 입력 : ");
		userInfo.setId(sc.nextLine());
		System.out.print("비밀번호 입력 : ");
		userInfo.setPw(sc.nextInt());
		
		ui.add(userInfo);
		sc.nextLine();
		for(int i = 0; i<ui.size();i++) {
			System.out.println(	userInfo.getId());
			System.out.println(	userInfo.getPw());
			System.out.println("======================");
				
		}
		}
	}
}
