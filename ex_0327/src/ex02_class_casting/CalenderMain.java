package ex02_class_casting;

public class CalenderMain {
	public static void main(String[] args) {
		DeskCalender dc = new DeskCalender("보라색",6);
		dc.info(); // 자식 오버라이드
		dc.hanging(); // 부모 선언
		dc.onTheDesk(); // 자식 선언
		System.out.println();
		
		Calender c = new DeskCalender("검은색", 12);
		c.info();
		c.hanging();
		//DeskCalender 객체임에도 Calender타입이라 DeskCalender 맴버엔 저근 불가능
		//c.onTheDesk();
	}
}
