package ex01_setter_getter;

public class Person_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		//필드가 private라 외부에서 직접 사용 불가
		//p.age=-30; // 코드상 문제는 없음
		
		//setter 메서드를 통해 필드에 값을 세팅해야한다.
		p.setAge(30);
		
		System.out.println(p.getAge());
	}

}
