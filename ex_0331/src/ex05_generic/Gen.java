package ex05_generic;

import java.util.ArrayList;
import java.util.List;

//Gen 클래스를 만들어, 제네릭 타입 T를 가지는
//printArr 메서드를 생성한다.
//printArr 메서드 내부에서 배열을 순차적으로 출력하는 코드 작성
//main에서 Integer, Double, Character 배열을 각각 만들고
//Gen클래스의 printArr 메서드를 각각 호출하여 배열의 내용을 출력하기
//결과
//1 2 3 4 5
//1.1 2.2 3.3 4.4 5.5
//A B C D E
public class Gen<T> {
	
	public void printArr(T[] arr) {
		for(T x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
