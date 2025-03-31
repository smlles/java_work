package ex06_list;

import java.util.ArrayList;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		//사람의 정보를 저장하고 싶어
		//이름, 키, 몸, 주소, 혈액형, 나이 .......
		ArrayList<Person> list = new ArrayList<>();
		
		Person p1 = new Person();
		p1.name="홍길동";
		p1.age=30;
		p1.height=182.4;
		
		Person p2 = new Person();
		p2.name="홍길순";
		p2.age=24;
		p2.height=176.4;
		
		list.add(p1);
		list.add(p2);
		
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).age);
		System.out.println(list.get(0).height);
		
		System.out.println(list.get(1).name);
		System.out.println(list.get(1).age);
		System.out.println(list.get(1).height);
		
	}
}
