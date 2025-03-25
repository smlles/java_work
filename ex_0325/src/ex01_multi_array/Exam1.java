package ex01_multi_array;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//
		int[][] arr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		//배열 arr과 평균을 구하시오.
		int sum = 0;
		float arr_sum = 0;
		for(int i = 0 ; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length;j++) {
				sum+=arr[i][j];
				arr_sum++;
			}
		}
		System.out.printf("배열 arr의 총합 : %d, 평균 : %.1f\n",sum,sum/arr_sum);
		
		//학생들의 정보를 입력하고 출력하는 프로그램 작성
		//학생들의 수학, 영어 성적을 등록하는 프로그램이다.
		//1. 프로그램을 실행하면, 몇명의 정보를 저장할 것인가 입력 받는다.
		//2. 입력 받은 수만큼의 학생들의 이름, 수학,영어 성적을 입력받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("학생은 몇명입니까? : ");
		int student_count = sc.nextInt();
		sc.nextLine();
		String[][] student = new String[student_count][3];
//		String[][]student = new String[2][3];
			for(int i = 0; i<student.length;i++) {
				System.out.println("이름, 수학점수, 영어점수를 순서대로 입력해주세요 : ");
					for(int j = 0; j <student[i].length;j++) {
						student[i][j] = sc.next();
						
					}
				}System.out.printf("%d명 등록 완료\n",student.length);
				for(int i = 0; i<student.length;i++) {
					System.out.printf("이름:%s\n",student[i][0]);
					System.out.printf("수학:%s\n",student[i][1]);
					System.out.printf("영어:%s\n",student[i][2]);
				}

		
	}
}


