package ex04_interface;

public class Kitchen implements Menu1,Menu2{
	//여러개의 인터페이스를 구현 할 수 있다.
	//인터페이스를 구현한 클래스는 반드시 추상메서드를 오버라이드 해야한다.
	@Override
	public String JJamBBong() {
		return "면+해물+육수";
	}

	@Override
	public String jajang() {
		return "면+춘장+완두콩";
	}
}
