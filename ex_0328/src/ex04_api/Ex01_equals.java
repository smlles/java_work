package ex04_api;

public class Ex01_equals {
	public static void main(String[] args) {
		//문자열 리터럴
		//같은 문자열일 때 이미 메모리에 있으면 참조
		String str1= "Hello";
		String str2= "Hello";
		
		//생성자를 통한 객체 생성
		String str3= new String("Hello");
		
		//주소 비교
		System.out.println("str1 vs str2 : "+ (str1==str2));
		System.out.println("str1 vs str3 : "+ (str1==str3));
		
		System.out.println("str1 hashcode : "+ System.identityHashCode(str1));
		System.out.println("str2 hashcode : "+ System.identityHashCode(str2));
		System.out.println("str3 hashcode : "+ System.identityHashCode(str3));
		
		//실제 값 비교
		System.out.println("str1 vs str2 : "+ str1.equals(str2));
		System.out.println("str1 vs str3 : "+ str1.equals(str3));
		
		str1 = "bye";
		System.out.println(str2);
		
		//문자열의 불변
		//문자열의 값은 바뀌지 않는다.
		//문자열을 수정하려 할 때 마다, 
		//메모리에 항상 새로운 문자열 개체가 생성된다
	}
}
