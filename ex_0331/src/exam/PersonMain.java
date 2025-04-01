package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		PersonFunction pf = new PersonFunction();
		Scanner sc = new Scanner(System.in);
		
		int selectMenu;
		String name = "";
		int age = 0;
		String tel = "";
		boolean running=true;
		while(running) {
			
			System.out.println("메뉴");
			System.out.println("1.정보추가");
			System.out.println("2.정보삭제");
			System.out.println("3.전체정보");
			System.out.println("4.종료");
			System.out.println("=================");
			System.out.print("작업 선택 : ");
			selectMenu = sc.nextInt();
			sc.nextLine();
			
			switch(selectMenu) {
			case 1 : 
				pf.PersonAdd(name, age, tel);
				break;
			case 2 : 
				System.out.println("삭제할 이름을 입력해주세요.");
				pf.PersonRemove();
				break;
			case 3 :
				System.out.println("전체 인원에 대한 정보입니다.");
				pf.PersonInfo();
				break;
			case 4 : 
				System.out.println("끗");
				running=false;
				break;
			}
		}
	}
}
	

