package ex04_overloading;

public class RectangleCalculatorMain {

	public static void main(String[] args) {
		
		RectangleCalculator r = new RectangleCalculator();
		
		r.area(5);
		r.area(5,6);
		System.out.println("직사각형 넓이 : "+r.area(5.6,7.8));
	}
}
