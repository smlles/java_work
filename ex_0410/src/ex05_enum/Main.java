package ex05_enum;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weekday[] day = Weekday.values();
		
		Weekday today = Weekday.SUNDAY;
		if(today ==Weekday.SUNDAY) {
			System.out.println("쉬는날 이지롱");
			
		}else {
			System.out.println("출근 x같다.");
		}
		
		/*for(Weekday d : day) {
			System.out.println(d.getDate());
		}*/
		
		int x = 10;
		int y = 5;
		for(Operation op :Operation.values()) {
			System.out.println(op + " : " +op.apply(x, y));
		}
		//객체를 직접 생성하는 것이 아니라 
		//getInstance() 메서드를 통해, 만들어진 객체를 불러올 수 있다.
		Calendar cal = Calendar.getInstance();
		
	}

}
