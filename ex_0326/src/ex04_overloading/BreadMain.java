package ex04_overloading;

public class BreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread bread = new Bread();
		
		bread.makeBread();
		bread.makeBread(5);
		bread.makeBread(4,"죽");
	}

}
