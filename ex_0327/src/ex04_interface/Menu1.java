package ex04_interface;

public interface Menu1 {
	//상수
	//값을 한번 넣으면 변경 불가능한 값
	final String name ="홍길동";
	
	
	//인터페이스에서는 어차피 추상만 들어갈 수 있어서
	//abstract 생략함
	public String jajang();
	
	//default 접근 제한자를 가진 메서드는 정의 가능
	default void f() {
		System.out.println("Hi");
	}
}
