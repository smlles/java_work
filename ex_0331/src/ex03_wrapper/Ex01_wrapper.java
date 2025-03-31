package ex03_wrapper;

public class Ex01_wrapper {

	public static void main(String[] args) {
		//Wrapper
		//프로그램에 따라 기본타입의 데이터를 객체형으로 표시 할 일이 있다.
		//이를 위해서 자바에서는 기본 자료형을 객체로 다루기 위한 클래스를 제공한다.
		//이를 Wrapper 클래스라고 한다.
		//기본형의 데이터 타입을 클래스로 포장하기 때문이다.
		
		//int -> Integer
		//char -> Character
		//float -> Float
		//double ->Double
		
		//생성자를 통한 선언은 JDK 1.9부터 사용하지 않는것을 권장
		Integer num01 = new Integer(10);
		
		Integer num02 = Integer.valueOf(10);
		
		Double dnum = Double.valueOf(30.12);
		

	}

}
