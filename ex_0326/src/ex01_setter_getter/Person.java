package ex01_setter_getter;

public class Person {
	//setter 사용시, 필드의 값을 외부에서 접근할 수 없게 제한
	private int age;
	//나이의 값을 설정하는 메서드
	//해당 메서드가 setter 역할을 메서드임을 알려주는 방법
	//메서드 명의 접두사에 set 추가
	public void setAge(int i) {
		if(i<=0) {
			System.out.println("나이가 음수냐");
			return; //메서드 종료
		}
		age = i; //age 필드에 저장
	}
	//메서드가 getter임을 알 수 있는 방법은
	//메서드 명의 접두사에 get 추가
	public int getAge() {
		return age;
	}
}
