package ex01_if;

public class Ex03_if_elseif_else {

	public static void main(String[] args) {
		//비교해야 할 조건이 여러개 있는 경우 사용
		//if문 안에 두개 이상의 조건식과 논리연산자를 사용 할 수 있지만
		//더욱 코드를 간결하게하고, 가독성을 높이기 위한 방법으로
		//if_else if 문을 구현한다.
		
		//if(조건식1){
		//	조건식1이 참일 때
		//} else if(조건식2) {
		// 조건식 1이 거짓 2가 참
		//} else if(조건식3){
		//	조건식1,2가 거짓이고 3이 참
		//} else { 
		//	위 조건이 다 거짓일 때
		//}
		
		//else if 문에 제한은 없는데
		//else if가 너무 많으면 프로그램 속도가 느려져서
		//다른 방법을 함께 고려할 것
		//else문은 생략 가능
		
		int favorite = 7 ;
		
		if  (favorite >5 ) {
			System.out.println("좋아하는 숫자는 5보다 큽니다.");
		} else if (favorite==7) {
			System.out.println("좋아하는 숫자는 7입니다.");
		}//효율적인 흐름으로 제어하기 위해, if문과 else if의 위치를 잘 선정해야한다.
		
	}

}
