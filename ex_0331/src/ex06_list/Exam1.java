package ex06_list;

import java.util.ArrayList;
import java.util.Scanner;

//arraylist를 만들어서 아래 결고 ㅏ도출
//아이디 생성 : abc(입력)
//abc
//아이디 생성 : abc
//중복된 아이디
//아이디 생성 : abc2
//abc abc2
//아이디 생성 : abc3
//abc abc2 abc3


public class Exam1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<>();
		
		out:while(true) {
			System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		
		for(int i=0;i<list1.size();i++) {
				if(id.equals(list1.get(i))) {
					System.out.println("중복");
					continue out;
					
				}
			
			
				
		
		}
		list1.add(id);
		for(int i=0;i<list1.size();i++) {
		System.out.printf(list1.get(i)+" ");
		}
		
		}
	}
}
	
