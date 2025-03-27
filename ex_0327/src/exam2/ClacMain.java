package exam2;

public class ClacMain extends Clac{

	public static void main(String[] args) {
		Clac c = new Clac(); 
		int[] a = {5,7,9};
		System.out.println("두 숫자의 합 : "+c.add(5, 10));
		System.out.println("두 숫자의 차 : "+c.substract(10, 5));
		System.out.println("평균 : "+c.average(a));
	}
}
