package ex03_phlymorphism;

abstract class Animal{
	abstract public void cry();
};
class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}//추상클래스를 상속받으면, 반드시 추상 메서드를 오버라이딩 해야함
};
class Cow extends Animal{
	@Override
	public void cry() {
		System.out.println("음메");
	}
};

class Farm{
	public void sound(Animal animal) {
		//들어온 객체에 따라 알아서 메서드가 호출됨
		animal.cry();
	}
}

public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}
}
