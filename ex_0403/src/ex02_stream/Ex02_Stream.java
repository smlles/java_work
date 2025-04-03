package ex02_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02_Stream {

	public static void main(String[] args) {
		//스트림의 중간연산
		//※ 중간연산으로 끝날 순 없음
		//항상 최종연산으로 마무리해야함
		//filter()
		//조건에 맞는 요소를 걸러냄
		List<String> list = Arrays.asList("Apple","Banana","Avocado");
		
		list.stream()
		.filter(t->t.startsWith("A"))
		.forEach(System.out::println);
		System.out.println("============================");
		
		//map()
		//각 요소를 변환
		list.stream()
		.map(t -> t.toUpperCase())
		.forEach(System.out::println);
		System.out.println("============================");
		
		//distinct()
		//중복제거
		Stream.of("a","b","a","c")
			.distinct()
			.forEach(System.out::println);
		System.out.println("============================");
		
		//sort()
		//정렬
		Stream.of("banana","apple","cherry")
			.sorted()
			.forEach(System.out::println);
		System.out.println("============================");
		
		//limit()
		Stream.of(1,2,3,4,5)
			.limit(3)
			.forEach(System.out::println);
		System.out.println("============================");
		
		//skip
		Stream.of(1,2,3,4,5)
		.skip(2)
		.forEach(System.out::println);
		System.out.println("============================");
		
		//peek()
		//값을 유지하면서 중간에 볼 수 있게 해준다.
		//중간 디버깅용
		Stream.of("one","two","three")
			.peek(t->System.out.println("peek : "+ t))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		System.out.println("============================");
		
		
		
	}

}
