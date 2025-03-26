package ex04_exam;

import java.util.Random;
import java.util.Scanner;

public class MethodTest {
	Scanner sc = new Scanner(System.in);
//	Random r = new Random();
	//1에서 50사이 난수 생성
	//main쪽에서 키보드를 통해 정수를 입력
	//check() 메서드를 만들어서 사용자가 입력한 숫자를 판단
	//크면 다운 작으면 업 출력  맞으면 정답
//	int random_number = new Random().nextInt(50)+1;
//	public int check(int number) {
//		if(number==random_number) {
//			return 0;
//			
//		}else if (number<random_number) {
//			System.out.println("UP!");
//			return 1;
//		
//		}else if (number>random_number) {
//			return 2;
//			
//			
//			}
//		}
	
	public void calculator(int num1,String a,int num2) {
		int result = 0;
			if (a == "+") {
				result =num1 + num2;
				System.out.printf("%d %s %d = %d\n",num1,a,num2,result);
			}else if (a =="-") {
				result = num1-num2;
				System.out.printf("%d %s %d = %d\n",num1,a,num2,result);
			}else if (a =="*") {
				result = num1*num2;
				System.out.printf("%d %s %d = %d\n",num1,a,num2,result);
			}else if (a =="/") {
				result = num1/2;
				System.out.printf("%d %s %d = %d\n",num1,a,num2,result);
			}else {System.out.println("잘못된 연산자 입니다.");
			
		}
		
	}
	
	
	public void maxFinder(int[]arr) {
		int max=0;
			for (int i = 0; i<arr.length;i++) {
				for(int j = 0; j<i;j++) {
					if(arr[i]>arr[j]) {
						max=arr[i];	
					}
			}	
		}
		System.out.printf("최대값은 %d 입니다.",max);		
	}
	//원 넓이 둘레
	//함수 호출 반지름 받기
	public void circleRound(double r) {
		
		System.out.println("원의 둘레는 "+3.14*2*r);
	}
	
	public double circleArea(double r) {
		return 3.14*r*r;
	}
	
	//계산기
	//사칙연산 할 수 있는 calculator 메서드
	//두 수와 연산자를 매개 변수로 받는다
	
//  Graph라는 이름의 메인 클래스를 만들어 
  //0 ~ 9사이의 난수를 100개 저장하는 배열을 만들고, 
  //해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해 보자.
//
//  단, 발생한 난수의 그래프화 작업은 PrintGraph클래스가 하도록 한다.
//
//  결과:
//  0507...... //난수 100개
//  0의 갯수 : ############ 12
//  1의 갯수 : ######### 9
//  2의 갯수 : ########### 11
//  3의 갯수 : ######## 8
//  4의 갯수 : ############## 14
//  5의 갯수 : ####### 7
//  6의 갯수 : ######### 9
//  7의 갯수 : ############# 13
//  8의 갯수 : ####### 7
//  9의 갯수 : ########## 10
	 

}