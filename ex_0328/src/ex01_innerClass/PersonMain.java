package ex01_innerClass;

public class PersonMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.mySelf();

		
		Person p = new Person() {
			@Override
			public void mySelf() {
				System.out.println("나는 회사원 이에요.");
			
			}//한번 쓰고 말거면 이렇게 해도 됨
		};
	}
}
