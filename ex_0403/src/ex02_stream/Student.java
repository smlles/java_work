package ex02_stream;

public class Student implements Comparable<Student> {
	
	String name;
	int ban;
	int totalScore;
	
	public Student(String name, int ban, int totalScore) {
		this.name=name;
		this.ban=ban;
		this.totalScore=totalScore;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%s, %d %d]",name,ban,totalScore).toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	//compareTo()
	//객체를 서로 비교할 때 사용하는 메서드
	//주로, 정렬이나 비교연산에 사용
	
	//int result = a.compareTo(b);
	
	//반환값이 0이면 두 객체가 같다
	//반환값이 0보다 작으면 a가 작다
	//반환값이 0보다 크면 a가 크다
	@Override
	public int compareTo(Student s) { //성적이 높은 순 정렬
		// 내가 매개변수로 전달한 객체의 총점 - 메서드를 호출 한 객체의 총점
		return s.totalScore - this.totalScore;
	
	}
	
}
