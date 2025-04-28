package Exam;

import java.util.HashMap;
import java.util.Map;

public class FindWord {
	public Map<String, Integer> wordFrequency(String text){
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		String[] words = text.split(" ");
		//단어 빈도수 계산
		for(String word:words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
		}
		return wordCount;
	}
	
}
