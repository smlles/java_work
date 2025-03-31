package ex05_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04_generic {

	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>(Arrays.asList(1,2,3));
		List<String> stringList = Arrays.asList("apple","banana");
		print(lists);
	//	print(stringList);
	}
	
	//와일드카드는 메서드의 매개변수의 타입으로 사용하는 것이 일반적
	
// 		전체 클래스
//	public static void print(List<?> list) {
//		for(Object e : list) {
//			System.out.println(e);
//		}
//	}
		//Number와 그 자식 클래스까지만
//		public static void print(List<? extends Number> list) {
//			for(Object e : list) {
//			System.out.println(e);
//
//			}
//		}
	// Integer를 포함한 부모타입까지 허용 
	public static void print(List<? super Integer> list) {
		for(Object e : list) {
			System.out.println(e);
		}
	}
}
//