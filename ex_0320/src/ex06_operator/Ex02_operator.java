package ex06_operator;

public class Ex02_operator {

	public static void main(String[] args) {
		//이항연산자
		//피연산자가 두개인 연산자
		
		//산술연산자
		int x = 100;
		int y = 200;
		System.out.println(x+y);//300
		System.out.println(x-y);//-100
		System.out.println(x*y);//20000
		System.out.println(x/y);//몫만나옴
		System.out.println(x%y);//나머지만나옴
		//오버플로우발생
		int result = 1000000 * 1000000;
		System.out.println(result);
		
		//산술변환
		//기본적으로 이항연산자의 연산은 두 피연산자의 타입이 같아야 한다.
		//컴퓨터는 서로 다른 타입을 계산 할 수 없으므로
		//값의 손실이 적은 방향으로 타입을 맞춰줘야 한다.
		//long + int => long + long -> long
		// float + in => float + float ->float
		//double + float => double + double -> double
		
		//대입연산자
		//우변값을 좌변에 대입
		
		//복합대입연산자
		//산술연산자와 대입연산자가 합쳐진 형태
		//a=a+,-,*,/,% b
		 x=10;  y=1;
		 y+=x; // y=y+x;
		 System.out.println(y);
		 y*=x; // y=y*x;
		 System.out.println(y);
		 
		 //비교연산자
		 //변수나 상수의 값을 비교하여 참,거짓을 판단하는 연산자
		 //결과는 true나 false로 반환된다.
		 int a = 10 ;
		 int b = 20 ; 
		 System.out.println(a>b);
		 System.out.println(a<b);
		 System.out.println(a==b);
		 System.out.println(a!=b); //같지않다.
		 
		 
		 //논리연산자
		 int myAge=30;
		 int limit=35;
		 //&&(and) 앞 뒤가 둘 다 참이어야 참을 반환
		 boolean result1 = (limit-myAge)>=5&&myAge>30;
		 System.out.println("&&연산결과 : " + result1);
		 //||(or) 앞 뒤 피연산자 중 하나라도 참이면 참을 반환
		 boolean result2 = (limit-myAge)>=5||myAge>30;
		 System.out.println("||연산결과 : " + result2);
		 
		 //비트연산자
		 //논리연산자와 유사하지만 bit단위의 연산만 가능
		 //& 논리곱 (and) 두 항이 모두 참이면 참, 아니면 거짓
		 //| 논리합 (or) 두 항 중 하나라도 참이면 참, 둘 다 아니면 거짓
		 //^ 베타적논리합 (xor) 두 항이 다르면 참, 같으면 거짓
		 //~ 부정(not) 참을 거짓으로, 거짓을 참으로 연산
		 
	}

}
