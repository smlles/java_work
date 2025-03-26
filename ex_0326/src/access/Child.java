package access;

import ex05_inheritance.Parent;

public class Child extends Parent{
	void accessTest() {
		//protected키워드가 붙은 메서드도 이렇게 접근 가능
		super.accessProtected();
	}
	Parent p1 = new Parent();
	//p1.accessProtected();
}
