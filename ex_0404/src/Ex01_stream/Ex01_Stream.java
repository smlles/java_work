package Ex01_stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01_Stream {

	public static void main(String[] args) {
		// 무한스트림
		//Stream.generate()
		//값을 무한하게 만든다
		//limit()로 개수를 제한하는게 좋음
		Stream<String> stream = Stream.generate(() -> "hello").limit(3);
		stream.forEach(System.out::println);
		
		
		//Stream.iterate();
		Stream<Integer> stream1 =Stream.iterate(1, n -> n+2).limit(5);
		stream1.forEach(System.out::println);

		//기본자료형 스트림
		//int -> IntStream
		//long -> LongStream
		//double -> DoubleStream
		
		IntStream intStream = IntStream.of(1,2,3,4,5);
		IntStream.range(1, 5).filter(x->x%2==0).forEach(System.out::println);;//1~4
		IntStream.rangeClosed(1, 5);//1~5
		
		//Random클래스를 통한 스트림 생성
		
		//ints() : IntStream 생성
		//ints(개수, 시작값, 종료값)
		System.out.println("==================================");
		Random random = new Random();
		random.ints(10,1,46).forEach(System.out::println);;
		
		//OptionalInt optInt = OptionalInt.empty();
		//System.out.println(optInt.getAsInt());
		
		Optional<String> opt = Optional.ofNullable(null);
		System.out.println("opt = " + opt);
	}
}
