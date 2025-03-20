package ex05_Scanner;

import java.util.Scanner;

public class Ex01_scanner {

	public static void main(String[] args) {
		//데이터의 입력
		//프로그램을 실행 할 때 키보드를 통해 입력한 데이터를 변수에 대입하겠다
		
//		java.util패키지에 있는 scanner클래스를 이용해야한다
//		다른 패키지에 있는 기능을 사용하기 위해서 import를 해야한다.
		//import 경로 
		//let obj = new Object()
		//obj.key = value; // 프로퍼티가 없으면 추가
		Scanner sc = new Scanner(System.in);  //Scanner 객체 선언
//		System.out.print("정수 입력 : ");
//		int n = sc.nextInt(); //정수 입력받기
//		System.out.println(n);
		
		//나이 입력받기
		//제 나이는 n세입니다.
		
		System.out.print("나이를 입력하기 : ");
		int age = sc.nextInt();
		System.out.print("이름을 입력하기 : ");
		String name = sc.next(); //띄어쓰기하면 끝남
		sc.nextLine(); //엔터 가져감
		System.out.print("주소를 입력하기 : ");
		String address = sc.nextLine();
		
		System.out.printf("제 나이는 %d살입니다. 제 이름은 %s입니다. 제 주소는 %s입니다.",age,name,address);
	}

}
