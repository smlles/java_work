package ex05_generic;

public class GenEx<T> {
	//타입 자리에 제네릭으로 때워 넣을 수 있음 
	//정해지는 타이밍은 객체가 생성될 때
	T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}

