package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("홍길동", 20);
		st.printInfo();

		Stream<String> upperHello = Stream.of("hello");
		upperHello.map(x -> x.toUpperCase()).forEach(System.out::print);

		List<String> list = Arrays.asList("apple", "dog", "banana", "cat", "grape");
		Stream<String> s_list = list.stream();

		s_list.filter(x -> x.length() >= 4).sorted().forEach(System.out::println);

	}
}
