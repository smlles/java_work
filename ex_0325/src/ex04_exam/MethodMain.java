package ex04_exam;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest mt = new MethodTest();
			int[]arr = {1,2,3,4,5};
			
			System.out.println();
		mt.maxFinder(arr);
	
		mt.circleRound(5);
		System.out.println(mt.circleArea(5));
		
		mt.calculator(2,"+",9);
		mt.calculator(2,"-",9);
		mt.calculator(2,"*",9);
		mt.calculator(2,"/",9);
		Scanner sc = new Scanner(System.in);
		
		
//		while(true) {
//			System.out.print("숫자 입력 1~50 : ");
//			int answer = sc.nextInt();
//			if(mt.check(answer).equals("정답!")) {
//				System.out.println("정답");
//				break;
//			}else {
//				System.out.println(mt.check(answer));
//			}
//		}
//	}

	}}
