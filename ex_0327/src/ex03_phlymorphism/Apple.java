package ex03_phlymorphism;

public class Apple extends Computer{
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("아쁠");
	}
}
