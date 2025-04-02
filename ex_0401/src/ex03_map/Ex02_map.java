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
		
		boolean checkid = false;
		
		while(!checkid) {
			System.out.print("ID 입력 : ");
			id = sc.nextLine();
			System.out.print("PW 입력 : ");
			pw = sc.nextInt();
			sc.nextLine();
			if(!map.containsKey(id)) {
				System.out.println("아이디가 없음!");
				continue;
			}else {
					if(map.get(id)!=pw){
						System.out.println("비밀번호 불일치!");
						continue;
					} else {
						System.out.println("로그인 성공!");
						checkid=true;
						break;
				}
			}
		}
	}
}