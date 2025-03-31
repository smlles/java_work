package ex06_list;

import java.util.ArrayList;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		//리스트의 선언
		ArrayList<String> list = new ArrayList<>();
		
		//데이터 삽입
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		//리스트 출력
		//변수명으로 출력해도 주소가 아닌 내용이 나옴
		System.out.println("리스트 내용 1 : "+list);
		
		//리스트의 3번쨰 위치에 요소 삽입
		list.add(2,"수박");
		System.out.println("리스트 내용 2 : "+list);
		
		//데이터 수정
		list.set(0, "사과");
		list.set(1, "키위");
		System.out.println("리스트 내용 3 : "+list);
		
		
		//데이터 삭제
		//remove(int index) -> 삭제하고 삭제한 value를 반환
		System.out.println(list.remove(3));
		System.out.println("리스트 내용 4 : "+list);
		
		
		//리스트에서 데이터 가져오기
		System.out.println(list.get(1));
		
		//리스트의 모든 내용 출력하기
		for (int i =0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
		/*향상된 for문
		 * */
		for (String x : list) {
			System.out.println("값 : "+ x);
		}
		
		
	}

}
