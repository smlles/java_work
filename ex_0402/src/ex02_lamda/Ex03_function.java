package ex02_lamda;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex03_function {
	public static void main(String[] args) {
		//컬렉션 프레임워크의 인터페이스에 일부는 함수형 인터페이스를 사용한다
		ArrayList<String> list = new ArrayList<>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");
		
		//void accept(T t);
		//list의 요소를 하나씩 꺼내서 출력
		list.forEach(System.out::println);
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		hs.forEach(System.out::println);
		
	}
}
