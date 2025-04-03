package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class P_lamda{
	//리스트의 필터 메서드를 만듬
	//숫자 리스트에서 조건을 결합한 결과만 필터
	//Predicate<Integer>를 사용해 다음 조건 구현
	//짝수 , 100이상 ,200미만
	public List<Integer> filter(List<Integer> list, Predicate<Integer> condition){
		List<Integer> result = new ArrayList<>();
		for(Integer num : list) {
			if(condition.test(num)) {
				result.add(num);
			}
		}
		
		
		return result;
	}
}

public class Exam1 {

	public static void main(String[] args) {
		P_lamda pl = new P_lamda();
		List<Integer> numbers = Arrays.asList(50,80,120,150,180,210,250,300);
		
		Predicate<Integer> p = i -> i>=100;
		Predicate<Integer> q = i -> i<200;
		Predicate<Integer> r = i -> i%2 ==0;
		
		Predicate<Integer> c = p.and(q).and(r);
		
		List<Integer> list = pl.filter(numbers, c);
		 
		
		System.out.println(list);
		
	}

}
