package ex03_phlymorphism;

public class Samsung extends Computer{
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("아이 러브 샘숭");
	}
}
