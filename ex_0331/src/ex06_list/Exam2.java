package ex06_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	
	
	
	
	

public class Exam2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> products = new ArrayList<>();
	//	viewProduct vp = new viewProduct();
		System.out.print("상품 조회(종료=exit) : ");
		while(true) {
		
		String input = sc.next();
		if(input.equals("exit")) {
			break;
		}
		viewProduct(products,input);
		}
		System.out.println("최종 상품 목록 : "+products);
		
		
	}
	
	public static void viewProduct(List<String> list,String product){
		//중복제거
		if(list.contains(product)) {
			System.out.println("이미 있음");
			
			list.remove(product);
		}else {
			list.add(0,product);
		}
		
		//최근 검색 맨앞
		
		System.out.println("상품 클릭 : "+product + " -> " + list);
	}
	//viewProduct
	//products라는 이름의 ArrayList를 만들고
			//입력받아서 상품을 추가하기 (조회)
			//상품이 중복되면 제거
			//최근 조회한 상품 목록이 가장 앞에 나오게
	
	
}
