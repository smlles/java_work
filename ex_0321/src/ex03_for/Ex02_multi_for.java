package ex03_for;

public class Ex02_multi_for {
	public static void main(String[] args) {
		//for문 안에 또 다른 for문
		//반복문을 반복하기
		/*for(초기;조건;증감){
		 *	for(초기;조건;증감){
		 *		반복 할 일
		 *	}
		 *}
		*/
		int i; int j;
		for(i = 0; i<3; i++) {
			for(j = 0; j<3; j++) {
				System.out.println(i+" "+j);
			}
		}
		//A B C D
		//E F G H
		//I J K L 
		char ch = 'A';
		for(i = 0; i<3;i++) {
			for(j = 0 ; j < 4; j++) {
				System.out.printf("%c ",ch);
				ch++;
			}
			System.out.println();
		}
		
		//
		System.out.println("주사위를 두개 던져 6이 나올 경우의 수는 ");
		for(i=1;i<=6;i++) {
			for(j=1;j<=6;j++) {
				if(i+j==6) {
					System.out.printf("%d,%d\n",i,j);
				}
			}
		}
		
	}
}
