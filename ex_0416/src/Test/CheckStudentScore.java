package Test;

import java.util.Scanner;

public class CheckStudentScore {
	/*- 한 학급에는 여러 명의 학생이 있으며, 각 학생은 여러 국,영,수 시험을 응시한 점수를 가지고 있다.
	
	```
	학생의 이름과 그 학생의 시험 점수들이 주어진다.
	
	모든 학생의 이름과 점수를 효율적으로 저장할 수 있는 구조를 설계하라.
	
	각 학생의 평균 점수를 계산하고, 평균이 80점 이상인 학생만 이름과 평균 점수를 출력하라.
	```
	### 힌트
	- 여러 점수를 하나의 값으로 저장하는 것은 비효율적일 수 있음*/

	private String name;
	private int k_score;
	private int e_score;
	private int m_score;

	public CheckStudentScore(String name, int k_score, int e_score, int m_score) {
		this.name = name;
		this.k_score = k_score;
		this.e_score = e_score;
		this.m_score = m_score;
	}

	public void setM_score(int m_score) {
		this.m_score = m_score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getK_score() {
		return k_score;
	}

	public void setK_score(int k_score) {
		this.k_score = k_score;
	}

	public int getE_score() {
		return e_score;
	}

	public void setE_score(int e_score) {
		this.e_score = e_score;
	}

	public int getM_score() {
		return m_score;
	}
}
