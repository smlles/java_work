package ex01_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class exam1 {
//가장 많이 주문된 상품 구하기
//각 사용자는 여러 상품을 주문 할 수 있으며
//주문 내역은 ArrayList에 문자열로 저장
//사용자 이름 : 상품이름 형태로 저장이 된다.
//가장 많이 주문된 상품 이름과 수량을 출력하기
//List<String> orders = Array.asList(
// "Alice:TV", "Bob:TV","Alice:phone","Charlie:TV",David:Tablet"
//	"Eve:Phone", "Frank:Phone","Alice:Phone" 
//결과 = phone : 4
	public static void main(String[] args) {
		HashMap<String,String> cOrder = new HashMap<>();
		HashMap<String,Integer> ordersCount = new HashMap<>();
		List<String> orders = 
				Arrays.asList("Alice:TV", "Bob:TV","Alice:Phone",
						"Charlie:TV","David:Tablet","Eve:Phone",
						"Frank:Phone","Alice:Phone");
		
// Alice = TV , Phone ,Phone
// Bob = TV
//Charlie = TV
//David = Tablet
//Eve = Phone
//Frank = Phone
		
		
		for(int i =0; i<orders.size();i++) {
			String[] order = orders.get(i).split(":");
			//for(int j = 0 ; j<order.length;j++) {
				cOrder.put(order[0], order[1]);
				//ex) Alice:TV 
				//ordersCount.put("TV", ordersCount.getOrDefault("TV", 0)+1);
				//ordersCount.put("TV", 0+1);
				//ordersCount.put("TV", 1);
				ordersCount.put(order[1], ordersCount.getOrDefault(order[1], 0)+1);
		//	}
		}
		
		System.out.println(ordersCount);
		
		//가장 많이 주문된 상품 찾기
		String maxProduct = null;
		int maxCount =0;
		for(Map.Entry<String, Integer> entry : ordersCount.entrySet()) {
			if(entry.getValue() > maxCount) {
				maxProduct = entry.getKey();
				maxCount=entry.getValue();		
			}
		}
		System.out.println(maxProduct + " = " + maxCount);
		
	//	System.out.println(Collections.max(ordersCount));
		
	
	
	
	
	
	
	
	
	
	
	
	}
}
