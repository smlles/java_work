package ex01_inheritance;

public class Cat extends Animal{
	//자식만의 특징
	String cute = "귀여움";
	
	public void info() {
		System.out.println("---고양이---");
		super.info();
		System.out.println("고양이 특징 :"+cute);
	}
}
