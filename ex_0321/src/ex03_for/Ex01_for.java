package ex03_for;

import java.util.Scanner;

public class Ex01_for {

	public static void main(String[] args) {
		// 반복문
		//특정 명령을 원하는 만큼 반복하여 실행하는 제어문
		//for , while
		
		//for
		//반복 횟수가 정해져있을 때
		
		//for(초기식 ; 조건식 ; 증감식){
		// 반복 할 일
		//}
		
		//초기식 : 반복하기 위한 시작값, 변수 하나를 초기화
		//조건식 : 반복을 위한 종료값, 비교 연산자를 많이 사용
		//증감식 : 초기식에 있는 변수를 증감시키는 역할을 함
		
		for(int i = 0; i<=3; i++) {
			System.out.println(i);
		}
		
		int i=0;// 초기값을 밖에 줄 수는 있다.
		for(;i<=3;) {
			System.out.println(i);
			i++; //증감값도 밖에다 쓸 수는 있음
		}
		//초기식 변수 i를 무조건 사용 할 필욘 없다. 사용하는게 나을 것 같다면 쓰자
		
		//1부터 10까지 출력하는 for문
		//가로로 나오게
		
		for(i=1;i<=10;i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		//10부터 1까지
		for(i=10;i>=1;i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
		//1부터 10까지 3의 배수만
		for(i=1;i<=10;i++) {
			if(i%3==0) {
				System.out.printf(i+" ");
			}
		}
		System.out.println();
		//1부터 10까지 총합
		int sum =0;
		for(i=1;i<=10;i++) {
			sum+=i;
		}System.out.println(sum);
		
		//키보드에서 정수를 하나 입력받아 해당 단의 구구단 출력하기
		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 단을 출력할거야? : ");
//		int n = sc.nextInt();
//		for(i=1;i<10;i++) {
//			System.out.printf("%d X %d = %d \n",n,i,n*i);
//		}
//		
		//키보드로 n을 입력받고 1ㅂ부터 n까지 총합 구하기
		sum=0;
//		System.out.print("어디까지 더할래? : ");
//		int n = sc.nextInt();
//		for(i=1;i<=n;i++) {
//			sum+=i;
//		}
//		System.out.println("다 더했어! 값은 "+sum+"이야!");
		//10개의 정수를 입력 받아서 그 중 짝수의 개수를 구하기
//		System.out.print("10개의 정수를 입력해! : ");
//		int m= 0;
//		for(i=1;i<=10;i++) {
//			int n = sc.nextInt();
//			if(n%2==0) {
//				m++;
//			}
//		}
//		System.out.printf("네가 입력한 숫자 중 짝수는 %d 개야! \n",m);
		
		//1 + (1+2) + (1+2+3)+... +(1+2+3+....+10)을 계산하세요
		sum =0; int total_sum=0;
		for(i=1;i<=10;i++) {
			 // 1+2+3+4+5+6+7+8+9+10
			total_sum+=sum+i;
			sum+=i;
			//1+(1+2)+(1+2+3)...
						//1+3+6+10+15+21+28+34+45+55
					// i+(sum+i)+(sum+i)+(sum+i)+(sum+i)
		}
		System.out.println(total_sum);
		
		//양의 정수 x를 받아
		//x가 홀수면 x이하의 홀수 정수의 합을 구하고
		//x가 짝수면 x이하의 짝수 정수의 제곱의 합을 구하기
		sum=0;
		System.out.println("양의 정수를 넣어볼까? : ");
		int n = sc.nextInt();
		if(n%2==1) {
			for(i=1;i<=n;i++) {
				if(i%2==1) {
					sum+=i;
				}	
			}	
		}else if(n%2==0) {
			for(i=1;i<=n;i++) {
				if(i%2==0) {
					sum= sum+ i*i;
				}
			}
		}System.out.println(sum);	
	}
}
