package ex02_lamda;

public class CalMain {

	public static void main(String[] args) {
		//1. 구현한 클래스를 객체로 만들어 메서드 사용하기
		CalculatorImpl cal1= new CalculatorImpl();
		int res = cal1.plus(10, 20);
		System.out.println("cal1 : "+res);

		//2.익명클래스를 통한 메서드 구현
		//cal2
		
		MyCalculator cal2 = new MyCalculator() {
			
			public int plus(int num1, int num2) {
				return num1+num2;
			}		
		};
		System.out.println("cal2 : "+cal2.plus(1,2));
		
		//3.람다식으로 구현
		MyCalculator cal3 =(num1,num2)->num1+num2; 
		res =cal3.plus(10, 20);
		System.out.println("cal3 : "+res);
		
		//이중콜론 : 메서드 참조 연산자
		//람다식을 간결하게 쓸 때 
		
	}
}