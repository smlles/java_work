package ex03_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ex03_map {

	public static void main(String[] args) {
		//문장을 입력받고, 단어별로 몇번 등장했는지 출력하기
		//ex : hello world hello java world java java
		//hello 2 world 2 java 3
		
		String sentense = "";
		System.out.print("문장을 입력하기");
		Scanner sc = new Scanner(System.in);
		sentense = sc.nextLine();
		String[] words = sentense.split(" ");
		
	//	HashSet<String> hs1 = new HashSet<>();
		HashMap<String,Integer> wordCount = new HashMap<>();
		
		for(String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
//			if(wordCount.containsKey(word)) {
//				int count = wordCount.get(word);
//				wordCount.put(word, count+1);
//			}else {
//				//단어 처음나왔을 때
//				wordCount.put(word, 1);
//			}
		}
		System.out.println("단어별 등장 횟수 ");
		for(String key : wordCount.keySet()) {
			System.out.println(key+" : " + wordCount.get(key));
		}
		//Map 인터페이스 메서드
		//V getOrDefault(K k, defaultValue)
		//Key가 존재하면 value를 반환
		//Key가 없으면 defaultValue 반환
		
		//v replace(K k ,V v)
		//put은 Key가 없으면 추가가 됨
		//replace는 Key가 없으면 추가가 안됨
		
		//V putIfAbsent(K k, V v)
		//키가 없을 경우에만 추가
		
		//키가 있는 경우
		//put -> 덮어 씀
		//putIfabsent() 아무것도 안함
		//keyset()
		//values()
		
		
	}		
}