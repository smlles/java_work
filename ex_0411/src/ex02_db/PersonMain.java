package ex02_db;

import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonMethod pm = new PersonMethod();
		List<Person> list2 = PersonMethod.find();
		for(Person p : list2 ) {
			System.out.printf("%d. 이름 : %s, 나이 : %d\n",p.getIdx(),p.getName(),p.getAge());
		}
		
		pm.add(15, "신창섭", 30);
	}

}
