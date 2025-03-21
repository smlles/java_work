package ex02_switch;

public class Ex03_switch {

	public static void main(String[] args) {
		/*java 12이상 버전은 switch 문법이 새로워졌다.
		조건절에 복수개의 값을 사용 할 수 있다.
		화살표 표현식을 이용하는게 가능
		*/
		//기존 switch와 다르게 case에 해당하는 절만 실행되고
		//그 후의 case는 실행되지 않는다.
		String day = "MONDAY";
		switch(day) {
		case "MONDAY","TUESDAY","WENDSDAY","THURSDAY","FRIDAY" ->System.out.println("평일");
			
		case "SATURDAY","SUNDAY" ->System.out.println("주말");
			
		default ->	System.out.println("일주일이 더있어?");
			
		}
		
		

	}

}
