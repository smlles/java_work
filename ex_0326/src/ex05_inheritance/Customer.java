package ex05_inheritance;
//자식클래스
public class Customer extends Person {
	int memberID;
	
	public Customer(String name, int age,int memberID) {
		super(name,age);// 부모 생성자 호출
		this.memberID = memberID;
	}
	
	void enter() {
		System.out.printf("회원번호 : %d (%s, %d)님이 입장하셨습니다.\n",memberID,name,age);
	}
}
