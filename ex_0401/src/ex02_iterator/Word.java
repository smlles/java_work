package ex02_iterator;

import java.util.HashSet;
import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		// 사용자가 입력한 문장에서 단어가 중복 되었는지 검사하기//split()
		Scanner sc = new Scanner(System.in);
		String str = "";
		System.out.println("문장을 입력하자");
		str = sc.nextLine();
		HashSet<String> hs1 = new HashSet<>();
		String [] arr = str.split(" ");
		//boolean hasDuplicate = false;
		//boolean add(E e)
		//잘 들어갔으면 true, 중복되면 false;
			//for(String arrs : arrr){
		//		if(!wordSet.add(word)){
		//		hasDuplicate = true;
		//		break;}}
		//		if(hasDuplicate){sysout"중복단어 있음;}
		//		else{sysout"중복단어없음";}
				for(int i =0; i<arr.length;i++) {
					hs1.add(arr[i]);
				}
				
				if(arr.length==hs1.size()) {
					System.out.println("중복되는 단어가 없습니다.");
				}else {
					System.out.println("중복되는 단어가 있습니다.");
					System.out.println("중복되는 단어의 수 : "+(arr.length-hs1.size()));
				}
		System.out.println(arr.length);
		System.out.println(hs1.size());
		
		
		
	}
}
