package ex05_generic;

import java.util.ArrayList;
import java.util.List;

//멀티타입 파라미터
//제네릭을 하나만 사용한다는 법은 없다
//만일 타입 지정이 여러개 필요하면, 해도 된다.

class Peach{};
class Grape{};

class FruitBox2<T,U>{
	List<T> peaches = new ArrayList<>();
	List<U> grapes = new ArrayList<>();
	
	public void add(T peach, U grape) {
		//리스트에 추가하기
		peaches.add(peach);
		grapes.add(grape);
	}
}





public class Ex02_generic {
	public static void main(String[] args) {
		FruitBox2<Peach,Grape> box = new FruitBox2<>();
		box.add(new Peach(), new Grape());
		box.add(new Peach(), new Grape());
		box.add(new Peach(), new Grape());
		
		
	}
}
