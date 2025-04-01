package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonFunction {
	ArrayList<Person> p = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private String tel;
	public void PersonAdd(String name,int age, String tel) {
		Person person = new Person(name,age,tel);
		System.out.print("이름 입력");
		person.setName(sc.nextLine());
		System.out.print("나이 입력");
		person.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("번호 입력");
		person.setTel(sc.nextLine());
		System.out.println("정보 저장");
		p.add(person);
	}
	public void PersonRemove() {
		if(p.isEmpty()) {
			System.out.println("아무도 없음");
			
		}else {
		String dName = sc.nextLine();
		for(int i = 0; i<p.size();i++) {
			if((p.get(i).getName().equals(dName))) {
				p.remove(i);
				System.out.println("삭제되었습니다.");
				break;
				}else if(i+1==p.size()) {
					System.out.println("없는 이름");
				}
			}
		}
		
	}
	public void PersonInfo() {
		System.out.println("전체 인원 : "+p.size()+"명");
		for(int i = 0; i<p.size();i++) {
			System.out.println("이름 : "+p.get(i).getName());
			System.out.println("나이 : "+p.get(i).getAge());
			System.out.println("번호 : "+p.get(i).getTel());
			System.out.println("---------------------------");
		}
	}
}
