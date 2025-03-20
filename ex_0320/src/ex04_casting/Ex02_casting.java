package ex04_casting;

public class Ex02_casting {

	public static void main(String[] args) {
		//double -> float (float 범위 내)
		double d1 = 1.1234;
		float f1 = (float)d1;
		System.out.println("[double -> float] d1의 값 : " + d1 + ",f1의 값 : "+ f1);
		
	//double -> float (float 최소 범위보다 작을 경우)
		//float 최소값 : 14 x 10의 -45승
		double d2 = 1.0e-50; //1.0x 10의 -50승
		float f2 = (float)d2;
		System.out.println("[double -> float] d2의 값 : " + d2 + ",f2의 값 : "+ f2);
		
	//double -> float ( float 최대범위보다 큰 경우
		double d3 = 1.0e100; //1.0x 10의 100승
		float f3 = (float)d3;
		System.out.println("[double -> float] d3의 값 : " + d3 + ",f3의 값 : "+ f3);
		
		//double과 float 정밀도 차이
		double d4 = 9.123456789;
		float f4 = (float)d4;
		System.out.println("[정밀도차이] d4의 값 : " + d4 + ",f4의 값 : "+ f4);
	}

}
