package ex01_set;

import java.util.TreeSet;

public class Ex02_TreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> set1 = new TreeSet<>();
		//자바 컬렉션에서 제공하는 정렬된 set
				//중복은 여전히 허용하지 않지만, Tree기반이라, 자동 정렬은 가능
				//Red-Black Tree라는 자료구조를 기반으로 하고있다.
		
		set1.add(7);//루트노드
		set1.add(4);
		set1.add(1);
		set1.add(9);
		set1.add(5);
		System.out.println(set1);
		System.out.println(set1.first());//최소
		System.out.println(set1.last());//최대
		System.out.println(set1.higher(3));//입력값보다 큰 수 중 최소값
		System.out.println(set1.lower(3));//입력값보다 작은 수 중 최대값
		
		
		
		
		
		
		
		
		
		
	}
}
