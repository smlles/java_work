package ex03_try_catch;

public class Ex01_try_catch {
	public static void main(String[] args) {
		int result = 0;
		try {
			//예외가 발생 할 수 있는 가능성이 있는 코드
			result = 10/0;
			System.out.println("나누기 결과 : "+result);
		} catch (Exception e) {
			//예외 발생 시 어떻게 처리할건가
			System.out.println("0으로 어캐 나누게?");
		}
		System.out.println("프로그램 종료");
	}
}
