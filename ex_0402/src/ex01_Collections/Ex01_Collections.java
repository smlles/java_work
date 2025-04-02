package ex01_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01_Collections {
	public static void main(String[] args) {
		//collections
		//java에서 컬렉션을 다룰 때 기능을 제공하는 클래스
		//java.utill.Collections.패키지에 있다
		//모든 메서드는 정적메서드
		
		//sort()
		//리스트의 요소를 오름차순으로 정렬
		List<Integer> numbers = Arrays.asList(5,3,8,1,4,2,7,9);
		System.out.println("정렬 전 : "+numbers);
		Collections.sort(numbers);
		System.out.println("정렬 후 : "+numbers);
		
		//reverse(list)
		//리스트 요소의 순서를 내림차순 정렬
		Collections.reverse(numbers);
		System.out.println("내림 정렬 후 : "+numbers);
		
		//shuffle(list)
		//리스트 요소를 무작위로 섞음
		Collections.shuffle(numbers);
		System.out.println("섞은 후 : "+numbers);
		
		//min(Collection c)
		//컬렉션에서 최소값 찾기
		int min=Collections.min(numbers);
		System.out.println("최소값 :" +min);
		
		//max(collection c)
		//최대값
		int max = Collections.max(numbers);
		System.out.println("최대값 : "+max);
		
		//set , map은 list로 변환한 다음 사용해야함
		
		
	}
}
