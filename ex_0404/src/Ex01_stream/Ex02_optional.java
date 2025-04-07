package Ex01_stream;

import java.util.Optional;

public class Ex02_optional {

	public static void main(String[] args) {
		//스트림의 최종결과를 Optional로 반환하는 경우가 있었음
		//제네릭 클래스로 T타입의 객체를 감싸는 Wrapper 클래스
		
		Optional<String> optStr = Optional.of("abcde");
		//optStr에 들어있는 글자의 수를 반환
		Optional<Integer> optInt = optStr.map(String::length);
		System.out.println("optStr = "+ optStr.get());
		System.out.println("optInt = "+ optInt.get());
		
		//autoBox , unBox
		int result1 =Optional.of("123")
		.filter(x->x.length()>0)
		.map(Integer::parseInt)
		.get();
		System.out.println(result1);
	}
//
}
