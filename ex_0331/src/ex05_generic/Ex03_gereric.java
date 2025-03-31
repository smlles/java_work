package ex05_generic;

import java.util.List;

//제네릭에 들어가는 타입을 숫자로 제한 
class Calculator<T extends Number>{
	//필드에서도 사용 가능
	//<?> : 정확한 타입을 모를 때 사용
	//<T> : 정의하는 시점에서 사용
	List<? extends Number> numbersList;
	
	void add(T a, T b) {};
	void min(T a, T b) {};
	void mul(T a, T b) {};
	void div(T a, T b) {};
}
public class Ex03_gereric {
	public static void main(String[] args) {
		//Calculator<Object> cal1 = new Calculator();
		//Calculator<String> cal2 = new Calculator();
		Calculator<Integer> cal3 = new Calculator();
		Calculator<Float> cal4 = new Calculator();
		
	}
}
