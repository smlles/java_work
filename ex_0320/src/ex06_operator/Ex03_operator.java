package ex06_operator;

import java.util.Scanner;

public class Ex03_operator {

	public static void main(String[] args) {
		 //비트연산자
		 //논리연산자와 유사하지만 bit단위의 연산만 가능
		 //& 논리곱 (and) 두 항이 모두 참이면 참, 아니면 거짓
		 //| 논리합 (or) 두 항 중 하나라도 참이면 참, 둘 다 아니면 거짓
		 //^ 베타적논리합 (xor) 두 항이 다르면 참, 같으면 거짓
		 //~ 부정(not) 참을 거짓으로, 거짓을 참으로 연산
		 int y ;
		int a = 10;	//1010
		int b = 7;	//0111
		int c = a & b;
		System.out.println("c : "+c);
		int a2=12;	//1100
		int b2=8;	//1000
		int c2 = a2|b2; //1100
		System.out.println("c2 : "+c2 );
		int a3 = 9;	//1001
		int b3 = 11;//1011
		int c3 = a3^b3;//0010 =2
		System.out.println("c3 : "+c3); 
		
		// ~(not)
		int x = 7; //0111 -> 1000
		System.out.println("~x : " +~x);
		//~x -> -(x+1)
		
		//시프트연산자
		//비트의 이동
		// << , >> 
		
		x=10; //1010
		int result = x<<1; //10100
		System.out.println(result);
		result = x>>1; //101
		System.out.println(result);
		
		//삼항연산자
		//조건식? 참일 때 실행 할 일: 거짓일 때 할 일
		
		int i = 10;
		int i2 = 15;
		
		result = i++ >= i2 ? 1 : 0 ; 
		System.out.println("result : "+ result);
		
		x=5; y=x++;
		System.out.println(x);
		System.out.println(y);
		
		x=10;y=20;
		int z = (++x)+(y--);
		System.out.println(z);
		a=10;b=12;
		System.out.println( ++a>=b||2+7<=b&&13-b>=0&&(a+=b)-(a%b)>10);
//		 			
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력 : ");
		int k_score =sc.nextInt();
		System.out.println("영어점수 입력 : ");
		int e_score = sc.nextInt();
		System.out.println("수학점수 입력 : ");
		int m_score = sc.nextInt();
		
		int avg = (k_score+e_score+m_score)/3;
		System.out.printf("평균 : ", avg);
	}

}
