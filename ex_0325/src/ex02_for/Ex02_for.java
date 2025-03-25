package ex02_for;

public class Ex02_for {

	public static void main(String[] args) {
		// 향상된 for문
		//jdk1.5부터 추가된 기능
		//배열, 컬렉션의 모든 요소를 참조하기 위한 반복문
		
		/*for(변수: 배열){
		 * 반복 할 일
		 * } 
		*///일반적 for문
		int[] ar = {1,2,3,4,5};
		for(int i = 0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		//향상된 for문
		//반복 대상의 요소를 하나씩 변수에 대입하며 진행하고, 반복 대상의 길이만큼 꺼내어 반복
		for(int i : ar) {
			System.out.println(i);
		}
	} 
}
