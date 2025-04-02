package ex03_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Ex04_Map {

	public static void main(String[] args) {
		//학생별 국 영 수, 점수 및 평균 계산
		//학생 이름, 국,영,수 입력, 
		//이름, 평균 출력
		String name ="";
	
		Scanner sc = new Scanner(System.in);
		HashMap<String,List<Integer>> studentMap = new HashMap<>();
		
		System.out.println("학생 정보 입력");
		for(int i = 0; i <3; i++) {
			System.out.print("학생 이름");
			name = sc.nextLine();
			System.out.print("국어 점수");
			int kScore= sc.nextInt();
			System.out.print("영어 점수");
			int eScore= sc.nextInt();
			System.out.print("수학 점수");
			int mScore= sc.nextInt();
			sc.nextLine();
			
			List<Integer> scores = Arrays.asList(kScore,eScore,mScore);
			studentMap.put(name, scores);
		}
		
		//학생평균
		//ketSEt() -> hashMAp에있는 모든 key를 set으로 만들어서 반환
		for(String stuname : studentMap.keySet()) {
			List<Integer> scores = studentMap.get(stuname);
			int total =0;
			for (int s : scores) {
				total +=s;
				
			}
			double avg = total / (double)scores.size();
			System.out.println(stuname+ " 평균 : "+avg);
		}
		
		
		
		
		
		
		
		
		/*
		System.out.println("시작");
		for(int i =0;i<3;i++) {
			System.out.print("학생 이름 입력");
			name = sc.nextLine();
			System.out.println("국어 점수 입력");
			int kScore = sc.nextInt();
			System.out.println("영어 점수 입력");
			int eScore = sc.nextInt();
			System.out.println("수학 점수 입력");
			int mScore = sc.nextInt();
			sc.nextLine();
			ave = (kScore+eScore+mScore)/3;
			scoreAverage.put(name, ave);
		}
		System.out.println(scoreAverage);
		Iterator<String> stuName = scoreAverage.keySet().iterator();
		System.out.println(stuName);
		HashMap<Integer,String> stuNum = new HashMap<>();
		
		while(stuName.hasNext()) {
			int i=0;
			stuNum.put(i+1, stuName.next());
			i++;
		}
		System.out.println(stuNum);
		for (int i =0; i<stuNum.size();i++) {
			System.out.println("학생 이름 : "+ stuNum.get(i));
			System.out.println("학생 평균 : "+ scoreAverage.get(i));
			
		}*/
	}

}
