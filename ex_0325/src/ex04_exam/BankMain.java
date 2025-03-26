package ex04_exam;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserInfo ui = new UserInfo();
		
		/*BankMain클래스를 만들고
		각각의 메뉴를 다음과 같이 만들고 
		1.입    금 
		2.출    금 
		3.잔액확인 
		4.종    료

		메뉴를 선택할 시 기능을 호출한다.
		종료를 선택하면 프로그램이 종료된다
*/		
		
		boolean bank_system = false;
		while(!bank_system) {
		
		System.out.println("1.입금");
		System.out.println("2.출금");
		System.out.println("3.잔액확인");
		System.out.println("4.종료");
		System.out.print("메뉴 선택 : ");
		int i = sc.nextInt();
			switch (i) {
			case 1 :
				System.out.print("입금할 금액은? : ");
				ui.deposit(sc.nextInt());
				break;
			case 2 : 
				System.out.print("출금할 금액은? : ");
				ui.withdraw(sc.nextInt());	
				break;
			case 3 : 
				ui.showMoney();
				break;
			case 4 : 
				System.out.println("시스템 종료");
				bank_system=true; 
			}
		}
	}	
}
