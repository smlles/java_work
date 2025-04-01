package ex02_iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex01_iterator {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Iterator<Integer> iter = list.iterator();
		
		//Iterator aptjem
		//boolean hasNext();
		//다음값이 있다 true 없다 false;
		//e next();
			//다음값 반환
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.print(val+" ");
		}
		System.out.println();
		Set<Integer> set = new HashSet<>();
		for(int i = 0 ; i<=10; i++) {
			set.add(i);
		}
		Iterator<Integer> iter2 = set.iterator();
		while(iter2.hasNext()) {
			int val= iter2.next();
			System.out.print(val+" ");
		}
	}
}
