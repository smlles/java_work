package ex03_class;

public class ClassMain {
	public static void main(String[] args) {
		Car c = new Car();
		//필드를 사용하는 법,
		//객체명.필드명;
		System.out.printf("바퀴의 개수는 %d개 입니다.\n",c.wheel);
		//정수 -> 0 / 실수 ->0.0 / 배열,다른 클래스 -> null
		
		//구현 메서드를 사용하는 방법은 필드와 동일
		//다른 클래스에서 메서드를 사용하려면 객체를 생선한 후
		//참조 변수를 이용해 그 객체의 메서드를 사용해야한다
		//객체명.메서드();
		c.ride();
		c.ride();
		c.ride();
		c.ride();
		//메서드를 한번 선언하면, 필요 할 때 마다 여러번 호출 할 수 있다
		//즉, 메서드를 사용하면 반복적인 프로그래밍을 쉽고 간단하게 할 수 있다.
		
		//가족 구성원 객체 생성
		Family father = new Family();
		Family son = new Family();
		//정적 변수는 클래스명.필드명을 통해 대입, 출력을 한다.
		Family.address="인천";
		System.out.println(son.address);
		
		//정적 변수, 메서드의 경우, 객체생성 없이 사용 할 수 있다.
		System.out.println(Student.school_name);
		Student.go_to_school();
		
		//필드
		//일반 필드 -> 객체마다 상태가 다른거(이름,나이,직업,키...)
		//정적 필드 -> 객체 공통의 상태(눈,코,입,손,발...)
		
		//메서드 
		//메서드는 메서드 안에서 정의 할 수 없다.
		// 메서드는 메서드 안에서만 호출 할 수 있다.
		
		Student stu1 = new Student();
		
		stu1.student_name = "홍길동";
		stu1.hello();
	}
}
