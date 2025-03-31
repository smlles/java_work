package ex06_list;

import java.util.LinkedList;
import java.util.List;

public class Ex02_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//요소의 추가
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		//링크드 리스트는 index가 없지만, 자바에서는 list인터페이스를 구현하고 있어
		//index로 접근 할 수 있는 기능을 제공
		
		//3번쨰를 찾아감
		//Linked List의 경우, 앞에서부터 노드를 따라가서 해당 위치로 이동 후 처리
		System.out.println(list);
		//맨 앞,뒤에 추가하기
		list.addFirst("HTML");
		list.addLast("JavaScript");
		
		System.out.println(list);
		//조회
		System.out.println(list.get(0));
		
		/*			ArrayList vs LinkedList
		* 내부구조			배열 기반        노드 기반
		* 메모리			연속된 공간      노드마다 객체+포인터로 연결
		* 중간 삽입,삭제	느림				빠름
		* Index 접근 		빠름				느림
		* 전체순회			빠름				느림
		* 성능요약			검색빠름			삽입/삭제가 빠름
		* 			접근이 많을 때			삽입삭제가 많을 때
		* 
		* 
		*/
	}

}
