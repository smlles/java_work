package ex02_class_casting;

class Parent{}
class Child extends Parent{};

public class Example {
	public static void main(String[] args) {
		Parent p1 = new Parent();//부모타입 p1
		Child c1 = new Child(); //자식타입 c1
		
		Parent p2 = new Child(); //자동 타입 변환 
		Parent p3 = c1; //이미 만든 객체에 대한 타입 변경
		//Child c2 = p1; // 자동 타입 변환 불가
		
		//기본 자료형끼리 비교 == 연산자 : 값이 같은가?
		//객체 끼리 비교 ==연산자 : 주소값 비교
		if (p3 == c1) {
			System.out.println("p3와 c1은 같은 객체 참조중");
		}
	}
}
