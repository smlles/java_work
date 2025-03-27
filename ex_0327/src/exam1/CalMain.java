package exam1;

public class CalMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		System.out.println(cp.getResult(23, 7));
		System.out.println(cm.getResult(23, 7));
	}
}
//