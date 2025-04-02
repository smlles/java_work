package ex02_lamda;
//함수형 인터페이스가 되기위한 조건
//무조건 추상메서드 1개
@FunctionalInterface //어노테이션을 선언한 순간, 인터페이스에는 무조건 1개의 추상 메서드가 있어야 한다.
//0개도 안되고 2개도 안됨
public interface MyCalculator {
	int plus(int num1, int num2);
	
}
