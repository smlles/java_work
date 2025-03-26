package ex07_final;

public class Book {
	String title = "홍길동전";
	final int PRICE = 25000; //상수 , 다른 값 대입 불가능
	//final 메서드
	//자식 클래스에서 오버라이드 불가능
	public final void info_title() {
		System.out.println("책의 제목은 : "+title+" 가격은 "+PRICE);
	}
}
