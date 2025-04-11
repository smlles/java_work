package ex05_enum;

import java.util.Arrays;

public class EnumMain {

	public static void main(String[] args) {
		// 열거형은 직접 객체를 생성 할 수 없다.
		// enum의 생성자는 암묵적으로 private로 만들어져있다.
		// JVM이 각 상수를 단 한번만 생성하고 공유한다.
		
		
		Item i1 = Item.START;
		System.out.println(i1);
		//모든 열거형이 상속하는 Enum 클래스에 toString()메서드에서
		//이름을 반환하기 때문에 이름이 출력된다.
		
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		
	//열거형 상수에 들어있는 순서 보기
		for(Item item : items) {
			System.out.println("name="+item.name()+", ordinal="+item.ordinal());
			
			
		}
		Item i2 = Item.valueOf("START");
		System.out.println(i2);
		System.out.println(i1==i2);
		
		Item i3 = Item.EXIT;
		//열거형끼리는 ==이외의 비교 연산자는 사용 불가
		//compareTo()는 사용가능
		//System.out.println(i1>i3);
		System.out.println(i1.compareTo(i3));
		//a.compareTo(b)
		//a가 b보다 앞서면 음수
		//a와 b가 같으면 0
		//a가 b보다 뒤면 양수
		
		//열거형과 switch문
		//열거형 상수를 switch의 case에 사용 할 수 있다.
		
		switch(i1) {
		case START: //Iteam.START << 앞의 타입 생략 가능
			System.out.println("시작");
			break;
		case STOP:
			System.out.println("정지");
			break;
		case EXIT:
			System.out.println("종료");
			break;
		}
		
		for(Item item : items) {
			System.out.println(item.itemStr);
		}
		for(Item item : items) {
			System.out.println(item.symbol);
		}
	}//왜 why enum을 쓰는가?
	//1. 코드 가독성
	//int status = 1; << 무슨 상태지?
	//Status status = Status.SUCCESS; << 누가 봐도 성공임
	
	//2. 타입 안정성
	//정해진 값 말고 다른거 못넣음
	//열거형 안 쓸 떄
	int color = 9999999; //문법적으로 틀리지 않아 에러는 없음
	//우리가 설정한 색의 범주가 아님
	//Color color = Color.RED ; << 지정한 Color만 올 수 있음
	//

}
//