package ex02_class_casting;

public class Calender {

	String color;
	int months;
	
	public Calender(String color, int months) {
		this.color=color;
		this.months=months;
	}
	
	public void info() {
		System.out.println(color+"달력은"+months+"월 까지 있다.");
	}
	
	public void hanging() {
		System.out.println(color+"달력은 벽에 걸 수 있다.");
	}
}
