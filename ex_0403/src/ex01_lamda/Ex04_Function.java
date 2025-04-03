package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

class User{
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String sayHello() {
		return "Hello";
	}
}

public class Ex04_Function {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java","Python","C++");
		
		//1. 반복문
		System.out.println("1. 일반 반복문");
		for(int i =0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
		//2. 향상된 for문(enhanced for)
		System.out.println("2. 향상된 for문");
		for(String s : names) {
			System.out.println(s);
		}
		
		//3. forEach
		System.out.println("3. forEach");
		//names.forEach(x->System.out.println(x));
		names.forEach(System.out::println);
		
		//정적메서드 참조
		//static이 붙은 메서드
		//객체 생성 없이 사용 가능
		//Math.random 
		//Arrays.toString()
		//Integer.parseInt
		//Function<String,Integer> parse = t->Integer.parseInt(t);
		Function<String,Integer> parse = Integer::parseInt;
		int result = parse.apply("123");
		System.out.println(result);
		System.out.println("------------------------------------------");
		
		//생성자 참조
		//
		Supplier<ArrayList<String>> listSupplier = ArrayList::new;
		//Supplier<ArrayList<String>> listSupplier = new ArrayList<>();
		ArrayList<String> list =listSupplier.get();
		
		
		/*public User apply(String name, int age) {
			return new User(name,age);
		}
		(String name , int age ) -> {return new User (name , age)};
		(name , age) -> new User(name,age);
		User::new
		*/
		
		BiFunction<String, Integer, User> userCreator = User::new;
		User u = userCreator.apply("Alice", 30);
		
		System.out.println("------------------------------------------");
		//인스턴스 메서드 참조
		//Function<String,Integer> getLength = s -> s.length;
		Function<String,Integer> getLength =String::length;
		int length =getLength.apply("Hellow");
		System.out.println("문자열의 길이 : "+ length);
		
		//Function<User, String> hello = t -> t.sayHello();
		Function<User, String> hello = User::sayHello;
		System.out.println(hello.apply(u));
	}

}
