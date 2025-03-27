package ex01_inheritance;

public class Dog extends Animal{
	String smell = "냄새맡기";
	
	@Override
	public void info() {
		System.out.println("---강아지---");
		super.info();
		System.out.println("강아지 특징 "+smell);
	}
}
