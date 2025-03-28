package ex01_innerClass;

class PrintOut{
	static class Out{
		public void println(String str) {
			System.out.println(str);
		}
	}
}


public class StaticClassExample {
	public static void main(String[] args) {
		String str = "정적 내부 클래스 테스트";
		PrintOut.Out out = new PrintOut.Out();
		out.println(str);
		
		/*정적 내부 클래스 특징
		 *1. 외부 클래스의 객체 없이 사용 할 수 있어 효율적
		 *2. 외부 클래스의 정적 필드와 관련된 클래스를 내부에 묶고 싶을 때 적절
		 *3. 캡슐화에 좋음
		 *
		*/
	}
}
