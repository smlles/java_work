package ex01_lamda;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Function;

class Greeting{
	private String name;
	
	public Greeting(String name) {
		this.name=name;
	}
	public String sayHello() {
		return "hello, " + name;
	}
}
class Student{
	private int score;
	
	public Student(int score) {
		this.score = score;
	}
	public boolean isPassed(int cutLine) {
		return score >= cutLine;
	}
}

public class Exam2 {

	public static void main(String[] args) {
		// 여기서 Greeting 메서드를 참조하여 sayHello() 호출하기
		Function<String, Greeting> greet = Greeting::new;
		Greeting g = greet.apply("신창섭");
		
		Function<Greeting, String> hi = Greeting::sayHello;
		System.out.println(hi.apply(g));
		
		//학생이 특정 점수 이상인지 확인하는 메서드를 참조로 구하기 
		
		Function<Integer, Student> stuScore = Student::new;
		//Function<Integer, Boolean> pass = ;
		Student s = stuScore.apply(60);
		System.out.println(s.isPassed(65));
		BiPredicate<Student, Integer> passCheck = Student::isPassed;
		Student s1 = new Student(85);
		System.out.println(passCheck.test(s1, 70));
		
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		//조건에 맞으면 삭제
		list.removeIf(x->x%2==0);
		System.out.println(list);
	}

}
//창신섭신섭신상호ㅓㅏ의정