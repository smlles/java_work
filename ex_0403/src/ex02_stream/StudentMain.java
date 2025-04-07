package ex02_stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StudentMain {
 
	public static void main(String[] args) {
		Student[] students = {
				new Student("이자바",3,300),
				new Student("박자바",1,200),
				new Student("김자바",2,100),
				new Student("조자바",2,150),
				new Student("나자바",1,290),
				new Student("강자바",3,180),
				
				
		};
		
		//Comparator.comparing()
		//첫번쨰 정렬 기준
		//.thenComparing()
		//다음 두번쨰,  세번째 정렬기준을 연결 할 때 사용
		Stream.of(students) // 메서드의 참조가 아닌 람다식을 쓰게되면, 타입 추론이 불안정하게 될 수 있다.
		//컴파일러가 getBan()을 못 찾는 상황이 생길 수 있다.
		//자바에서 람다식은 타입을 명시하지 않아도, 컴파일러가 문맥을 통해 유추하려한다.
		//comparing의 반환타입이 Comparator<T>인데
		//마지막의 reversed()가 타입 유추를 복잡하게 한다.
		//그래서 람다식 안의 t의 타입 추론이 실패 할 수 있다.
		//참조식은 타입을 명확히 지정한다
		.sorted(Comparator.comparing(Student::getBan)
				.thenComparing(Student::getTotalScore).reversed())
		.forEach(System.out::println);
		
		
		
	}

}
