package ex04_overloading;

public class RectangleCalculator {
	//다양한 방법으로 사각형 넓이 구하기
	//1.정사각형의 한변의 길이를 받아 넓이 구하기
	//2.가로 세로 받아서 직사각형
	//3.실수형 가로 세로 받아서 실수 결과 반환
	//메서드 명 area
	double area;
	public void area(int a) {
		area = (int)a*a;
		System.out.println("정사각형 넓이 : "+area);
	}
	
	public void area(int a, int b ) {
		area = (int)a*b;
		System.out.println("직사각형 넓이 : "+area);
	}
	
	public double area(double a, double b) {
		area = a*b;
		return area;
	}
}
