package ex03_variable;

public class Ex01_variable {

	public static void main(String[] args) {
		//변수
		//프로그램을 만들고 실행하는데 필요한 값들을 메모리에 저장해두고
		//필요 할 때마다 꺼내서 사용
		
		//메모리에 무질서하게 저장되는 것이 아니라, 규칙속에서 일부 공간을 할당받는다.
		//메모리에 값을 저장하기 위해 할당해놓은 공간을 변수라고 한다.
		
		//1.변수의 선언
		//변수를 사용하기 위해서는 선언을 해야한다.
		//자료형 변수명;
		
		//변수명 짓는 규칙
		//1. 숫자, 특수문자($,_제외)가 첫글자로올 수 없다
		//2. 대소문자 구별 
		//3. 일반적으로는 영어 소문자로 시작
		//4. 특문 금지
		//5. 예약어 금지
		//6. 한글 X
		
		//표기법
//		카멜표기법
//		두번쨰단어부터 첫글자를 대문자로 표기
//		userName, homeAddress
		
//		스네이크표기법
//		모든 단어가 소문자로 시작하고 단어와 단어사이는 _로 연결하는 방식
//		user_name, home_address
		
		//변수에 데이터 입력하기
		//데이터를 직접 사용하는 대신, 변수에 저장하고 변수명을 사용하여 값을 사용 한다..
		
		int studentAge; 
		studentAge = 20;
		System.out.println(studentAge);
		
		boolean b = false;
		System.out.println("b의 값 : "+b);
		//자바는 변수의 타입을 지켜야한다.
		
		char ch = 'a';
		System.out.println("ch의 값 : "+ch);
		
		char ch2 = 65;
		System.out.println("ch2의 값 : "+ch2);
		
		byte by = 127;
		short s = 32767;
		int n = 550;
		
		System.out.println("by의 값 : "+by);
		System.out.println("s의 값 : "+s);
		System.out.println("n의 값 : "+n);
		
		//실수형
		float f1,f2;
		//java에서는 실수의 타입을 double형으로 인식하기 때문에
		//데이터가 float 타입이라는 것을 명시해야 함.
		
		f1 = 3.14f;
		f2 = 99;
		System.out.println("f1의 값 : "+f1);
		System.out.println("f2의 값 : "+f2);
		
		int my_age = 20;
		int your_age = my_age;
		my_age = 30;
		System.out.println(your_age);
		
		//두 변수의 값을 교환하려면 어떻게 해야 할까?
		int su1 = 20, su2=30;
		int temp;
		System.out.println("전su1="+su1);
		System.out.println("전su2="+su2);
		
		temp = su1;
		su1=su2;
		su2= temp;
		System.out.println("후su1="+su1);
		System.out.println("후su2="+su2);
		
	}

}
