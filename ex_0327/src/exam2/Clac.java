package exam2;

public class Clac extends Calculator{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int substract(int a, int b) {
		return a-b;
	}
	
	@Override
	public int average(int a, int b) {
		return (a+b)/2;
	}
	
}
