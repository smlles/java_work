package ex03_map;

import java.util.HashMap;

public class Ex01_HashMap {

	public static void main(String[] args) {
		HashMap<Integer,Character> map = new HashMap<>();
		//put(K k, V v)
		//HashMap 데이터 추가
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(4, 'A'); //Map에 저장되는 value는 중복 가능
		
		System.out.println(map);

		map.put(1, 'F');//같은 값을 가진 key가 있으면, value를 갱신한다
		
		System.out.println(map);
		
		//remove(K k)
		//데이터 삭제 
		map.remove(3);
		System.out.println(map);
		
		//size()
		//컬렉션 크기 반환
		System.out.println("map의 크기 : "+map.size());
		
		//get(K k)
		//데이터 조회
		char res = map.get(1);
		System.out.println(res);
		
		HashMap<String,Double> map2 = new HashMap<String, Double>();
		
		map2.put("k1", 100.0);
		map2.put("k2", 3.14);
		map2.put("k3", 4.15);
		double result = map2.get("k2");
		System.out.println(result);
		
		//containskey()
		//containsValue()
		//맵 안의 key/value가 존재하면 ture/ 없으면 false
		
	System.out.println(	map2.containsKey("k3"));
	}

}
