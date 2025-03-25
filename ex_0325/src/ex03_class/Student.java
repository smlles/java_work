package ex03_class;

public class Student {
	//main에 메서드를 생성해야하면 static으로 선언 
	//정적 필드
	static String school_name = "한국 고등학교";
	//정적 메서드 - 프로그램 시작과 동시에 올라감 
	static void go_to_school() {
		System.out.println("학교에 가다.");
	}	
	
	String student_name; //객체 맴버
	public void hello() {// 객체 없으면 못 씀
		System.out.println("안녕하세요. 제 이름은 "+student_name+"입니다.");
	}
}

