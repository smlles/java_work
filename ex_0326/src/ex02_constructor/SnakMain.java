package ex02_constructor;

public class SnakMain {

	public static void main(String[] args) {
		//생성자 : 특수 기능이 있는 메서드
		//메서드는 선언 -> 호출인데
		//우리는 생성자를 선언 한 적이 없음
		Snak chip = new Snak(5000);
		chip.info();
		Snak fries = new Snak(3000);
		fries.info();
		
		
	}

}
