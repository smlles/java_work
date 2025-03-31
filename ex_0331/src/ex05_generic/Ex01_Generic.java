package ex05_generic;

import java.util.ArrayList;
import java.util.List;

class Fruit{};

class Apple extends Fruit{};
class Banana extends Fruit{};

class FruitBox<T>{
//	T[] fruits = new T[]; 안됨
	//List : 제한이 없는 인덱스를 가지는 배열과 유사한 자료구조 
	List<T> fruits = new ArrayList<>();
	
	public void add(T fruit) {
		fruits.add(fruit);
	}
}

public class Ex01_Generic {
	public static void main(String[] args) {
		FruitBox<Fruit> box = new FruitBox();
		//제네릭 타입은 다형성 원리가 적용됨
		box.add(new Fruit());
		box.add(new Apple());
		box.add(new Banana());
		
		
		
		
		
	}	
}
