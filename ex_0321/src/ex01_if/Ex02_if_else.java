package ex01_if;

public class Ex02_if_else {

	public static void main(String[] args) {
		//if문만 사용하면, 조건이 참일 때 만 흐름을제어 할 수 있다.
		//조건이 거짓일 때에도 흐름을 제어하고 싶다면 if_else문을 사용한다.
		
//		if(조건식{
//			참일때 할 일
//		}else {
//			거짓일 때 할 일	
//		}
		
		int num = 5;
		if(num>4) {
			System.out.println(num+"은 4보다 크다.");
		} else {
			System.out.println(num+"은 4보다 작다.");
		}
		int a = 4;
		int b = 10;
		if (a>b) {
			System.out.println("a는 b보다 크다.");
		} else {//a가 b보다 작을수도, 같을수도 있다.
			System.out.println("a는 b보다 작거나 같다.");
		}
	}

}
