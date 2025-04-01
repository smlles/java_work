package ex01_set;

import java.util.HashSet;
import java.util.Random;

public class Ex01_set {
	//set의 객체 저장 순서를 저장하지 않는다
	//수학의 집합과 유사
	//중복 X , index가 없어, 데이터가 입력된 순서대로 출력된다는 보장이 없다.
	
	//HashSet
	//set에서 가장 많이 사용되는 클래스
	public static void main(String[] args) {
		
	
	HashSet<String> hs1 = new HashSet<>();
	//add(E e)
	//데이터 추가
	hs1.add("apple");
	hs1.add("banana");
	hs1.add("orange");
	hs1.add("apple");//중복은 추가하지 않는다
	System.out.println(hs1); //입력 순서대로 출력되지; 않는다
	hs1.add(null);
	System.out.println(hs1); //null도 한번은 저장할 수 있다.
	
	//HashSet이 중복되는 요소를 체크하는 방법?
	//1. hashcode()로 같은 주소를 가지는지 비교
	//2.hash값이 같으면 equals()로 실제값을 비교
	//3.위 둘이 같으면 삭제
	
	//remove()
	//삭제
	hs1.remove("apple");
	System.out.println(hs1);
	
	System.out.println(hs1.size());
	
	//contains(Object o)
	//요소가 있는지 판별
	System.out.println(hs1.contains("banana"));
	
	//HashSet을 언제 써야할까?
	//1. 중복없이 뽑아야 할 때
	//2. 순서나 정렬따위 개나줘버려
	
	//Hashset 객체를 이용해 로또를 뽑자
	HashSet<Integer> hs2 = new HashSet<Integer>();
	Random r = new Random();
	int x;
	while(hs2.size()!=6) {
		x=r.nextInt(45)+1;
		hs2.add(x);
		
		}System.out.println(hs2);
		//인덱스가 없어서 하나만 고를 수 없다.
		
		//Object[] arr = hs2.toArray();
				//형변환 필요 -> 타입 안정성 감소
				
		
		//HashSet을 배열 형태로 변환
		Integer[] arr = hs2.toArray(new Integer[0]);
		//그럼 왜 Integer에 0?
		//적절한 크기의 새 배열을 만들어서 반환을 알아서 해줌
		
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
	}
}