package ex02_break;

public class Ex02_break {

	public static void main(String[] args) {
		/*break문은 switch를 할 때 나왔음
		 * case를 종료할 때 사용
		 * 반복문이 진행되는 도중, 조건읆 만족해
		 * 더이상 반복문을 실행할 필요가 없다면
		 * 종료 할 때 사용한다.
		 */
		
		for(int i = 0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i+ " ");
		}
		System.out.println();
		int s = 0;
		while(s<10) {
			if(s==5) {
				break;
			}
			System.out.print(s+ " ");
			s++;
		}
		//break, continue같은 기타 제어문은
		//반복문 안에서만 사용 가능0
		//기타 제어문 밑에는 코드 올 수 없음
	}

}
