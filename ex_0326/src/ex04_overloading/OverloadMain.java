package ex04_overloading;

public class OverloadMain {

	public static void main(String[] args) {
		//같은 이름이지만, 인자에 따라 다른 기능을 하는 메서드를 만들 수 있다.
		Overload ol = new Overload();
		ol.result();
		ol.result(1);
		ol.result('a');
		ol.result("문자열",1);
		ol.result(1,"문자열");
	}

}
