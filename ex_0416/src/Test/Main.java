package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<String, List<Integer>> scores = new HashMap();

		boolean checkname = true;
		Scanner sc = new Scanner(System.in);

		while (checkname) {
			System.out.println("이름 국어 영어 수학 순서대로 입력 exit입력시 종료");
			String name = sc.nextLine();
			if (name.equalsIgnoreCase("exit")) {
				checkname = false;
				System.out.println("종료");
				break;
			}
			int k_score = sc.nextInt();
			int m_score = sc.nextInt();
			int e_score = sc.nextInt();
			sc.nextLine();
			CheckStudentScore st = new CheckStudentScore(name, k_score, e_score, m_score);
			List<Integer> s_scores = Arrays.asList(k_score, e_score, m_score);
			scores.put(name, s_scores);

		}
		for (String stuname : scores.keySet()) {
			List<Integer> s_score = scores.get(stuname);
			int total = 0;
			for (int s : s_score) {
				total += s;
				double avg = total / (double) s_score.size();
				if (avg >= 80) {
					System.out.println(stuname + " 평균 : " + avg);
				}
			}
		}
	}
}
