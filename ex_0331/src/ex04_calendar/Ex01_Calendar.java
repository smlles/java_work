package ex04_calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Ex01_Calendar {
	public static void main(String[] args) {
		//java.util에 있는 날짜와 시간 정보를 제공해주는 클래스
		//객체를 만들 때 new를 사용하지 않고, 생성된 객체를 받는다.
		
		Calendar cal = Calendar.getInstance();
		//
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.printf("오늘 날짜는 %d년 %d월 %d일 입니다.\n",year,month,day);
		
		//LocalDateTime
		//날짜 + 시간
		//java.time 패키지에 있음
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//of()
		//특정 날짜와 시간 만들기
		LocalDateTime dt = LocalDateTime.of(2025, 3,31,11,4);
		System.out.println("지정된 날짜와 시간 : "+dt);
		
		//날짜,시간 값 걷기
		System.out.println( dt.getYear()+"년");
		System.out.println( dt.getMonth()+"월");
		System.out.println( dt.getDayOfMonth()+"일");
		System.out.println( dt.getHour()+"시");
		System.out.println( dt.getMinute()+"분");
		System.out.println( dt.getSecond()+"초");
		
		//날짜 시간 더하고 빼기
		dt = LocalDateTime.now();
		LocalDateTime tomorrow = dt.plusDays(1);
		LocalDateTime twoHoursAgo = dt.minusHours(2);
		
		System.out.println("내일 : "+ tomorrow);
		System.out.println("두시간 전 : "+twoHoursAgo);
		
		//날짜 시간 비교
		LocalDateTime future = dt.plusDays(1);
		System.out.println("지금이 미래보다 이전인가? : "+dt.isBefore(future));
		System.out.println("지금이 미래보다 후인가? : "+dt.isAfter(future));
		
		//날짜,시간 포맷
		dt = LocalDateTime.of(2025,3,31,14,30);
		//java.time에 있는 클래스
		//날짜나 시가나을 문자열로 변경해 줄 수 있고,
		//문자열로 된 시간을 날짜/시간 타입으로 변경도 함
		//형식을 객체형태로 가짐 
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분");
		String formatted=dt.format(formatter);
		System.out.println(formatted);
		
		//자주 쓰는 포맷 형식
		//yyyy : 연도 (4자리)
		//yy : 연도  (2자리)
		//MM : 월 
		//dd : 일
		//HH : 시간(24시간)
		//hh : 시간(12시간)
		//mm : 분 
		//ss : 초
		//a : 오전/오후
		//E : 요일 -> MON,TUE
		//EEEE : 요일(풀네임) -> MONDAY, TUESDAY
	}
}
