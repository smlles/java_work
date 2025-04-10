package ex05_enum;

public enum Weekday {
//Weekday라는 열거형 정의, 요일 이름 상수로 넣는다
	MONDAY("출근하는 날 입니다."),
	TUESDAY("출근하는 날 입니다."),
	WEDENSDAY("출근하는 날 입니다."),
	THRUSDAY("출근하는 날 입니다."),
	FRIDAY("출근하는 날 입니다."),
	SATURDAY("출근하는 날 입니다."),
	SUNDAY("쉬는 날 입니다.");
//main메서드에서 오늘 요일이 Sunday이면 쉬는날 입니다. 출력
//그 외에는 출근하는날입니다 출력
	
	String work;
	
	Weekday(String work){
		this.work=work;
	}
	
	
	public String getDate() {
		return work;
	}
}
