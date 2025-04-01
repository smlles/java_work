package ex03_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02_map {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		//id와 비밀번호를 입력받아서 
		//아이디 존재하지 않음 / 비밀번호 불일치/ 로그인 성공
		String id = "";
		int pw;
		System.out.print("ID 입력 : ");
		id = sc.nextLine();
		System.out.print("PW 입력 : ");
		pw = sc.nextInt();
		boolean checkid = true;
		for(int i=0;i<map.size();i++) {
			if(!id.equals(map.containsKey(i))) {
				if(checkid) {
					System.out.println("아이디가 없음!");
				}
			}
			else if(!(pw==map.get(i))){
				System.out.println("비밀번호 불일치!");
			}else {
				System.out.println("로그인 성공!");
			}
		}
	}

}
