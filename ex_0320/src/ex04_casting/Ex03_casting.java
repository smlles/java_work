package ex04_casting;

public class Ex03_casting {

	public static void main(String[] args) {
		//float -> int 강제 형변환
		float f1 =12345.67f;
		int i1 = (int)f1;
		System.out.println("[float -> int] f1의 값 : " + f1 + ",i1의 값 : "+ i1);
		
		//double -> int 강제형변환
		double d1 = 12345.67;
		int i2 = (int)d1;
		System.out.println("[double -> int] f1의 값 : " + d1 + ",i2의 값 : "+ i2);
		
		byte b1 = 100;
		byte b2 = 20;
		byte b3 = (byte)(b1+b2);
		// byte의 표현범위가 127까지밖에 되지 않아
		//byte 끼리의 연산은 127을 넘을 가능성이 높다.
		//java개발자들은 byte 연산을 수행 할 때 int변수로 값을 받도록 만든다.
	}

}
